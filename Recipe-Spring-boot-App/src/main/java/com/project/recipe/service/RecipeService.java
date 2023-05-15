package com.project.recipe.service;

import com.project.recipe.DTO.RecipeDTO;
import com.project.recipe.DTO.RecipeDtoResponse;
import com.project.recipe.model.Recipe;
import com.project.recipe.repository.RecipeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    @Autowired
    private IndexStepService indexStepService;

    Logger logger = LoggerFactory.getLogger(RecipeService.class);


    public List<Recipe> fetchAllRecipes() {
        return recipeRepository.findAll();
    }

    public String saveRecipe(RecipeDTO recipeDTO) {
        Recipe oldRecipe = recipeRepository.findById(recipeDTO.getRecipe().getRecipeId()).get();
        if (oldRecipe != null) {
            return "This recipe is already added.";
        } else {
            recipeRepository.save(recipeDTO.getRecipe());
            indexStepService.addStepsOfRecipes(recipeDTO.getSteps());
            return "New recipe added.";
        }
    }

    public RecipeDtoResponse getRecipeById(int recipeId) {
        RecipeDtoResponse recipeDTO= new RecipeDtoResponse();
        recipeDTO.setRecipe(recipeRepository.findById(recipeId).get());
        recipeDTO.getSteps(indexStepService.getRecipeSteps(recipeId));
        return recipeDTO;
    }

    public String updateRecipe(RecipeDTO recipeDTO) {
        Recipe oldRecipe = recipeRepository.findById(recipeDTO.getRecipe().getRecipeId()).get();
//        List<IndexStep> newSteps= Arrays.asList(recipeDTO.getSteps());
        if (oldRecipe == null) {
            return "Recipe is Not Found.";
        } else {
            oldRecipe.setRecipeName(recipeDTO.getRecipe().getRecipeName());
            oldRecipe.setRecipeImage(recipeDTO.getRecipe().getRecipeImage());
            oldRecipe.setIngredientsDescription(recipeDTO.getRecipe().getIngredientsDescription());
            oldRecipe.setRatingForDifficultyAndQuality(recipeDTO.getRecipe().getRatingForDifficultyAndQuality());
            oldRecipe.setTimeRequiredToPrepare(recipeDTO.getRecipe().getTimeRequiredToPrepare());
            recipeRepository.save(oldRecipe);
            indexStepService.addStepsOfRecipes(recipeDTO.getSteps());
            return "Recipe Updated.";
        }
    }

    public String deleteRecipe(int recipeId) {
        logger.info("Going to delete recipe");
            recipeRepository.deleteById(recipeId);
            indexStepService.deleteRecipeSteps(recipeId);
            return "Recipe is deleted.";
    }
}
