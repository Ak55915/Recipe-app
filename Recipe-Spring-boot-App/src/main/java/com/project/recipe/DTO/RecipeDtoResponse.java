package com.project.recipe.DTO;

import com.project.recipe.model.IndexStep;
import com.project.recipe.model.Recipe;

import java.util.List;

public class RecipeDtoResponse {

    private Recipe recipe;

    private List<IndexStep> steps;

    public RecipeDtoResponse() {
    }

    public RecipeDtoResponse(Recipe recipe, List<IndexStep> steps) {
        this.recipe = recipe;
        this.steps = steps;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public List<IndexStep> getSteps(List<IndexStep> recipeSteps) {
        return steps;
    }

    public void setSteps(List<IndexStep> steps) {
        this.steps = steps;
    }
}
