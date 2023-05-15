package com.project.recipe.service;

import com.project.recipe.model.IndexStep;
import com.project.recipe.repository.IndexStepRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class IndexStepService {

    @Autowired
    private IndexStepRepository indexStepRepository;

    Logger logger= LoggerFactory.getLogger(IndexStepService.class);
    public List<IndexStep> getRecipeSteps(int recipeId) {
       logger.info("Getting recipe steps...");
        return indexStepRepository.getAllStepsOfRecipe(recipeId);
    }

    public void deleteRecipeSteps(int recipeId) {
        logger.info("deleting steps");
        indexStepRepository.deleteAllStepsOfRecipe(recipeId);
    }

    public void addStepsOfRecipes(IndexStep[] steps) {
        List<IndexStep> newSteps = Arrays.asList(steps);
        indexStepRepository.saveAll(newSteps);
    }

}
