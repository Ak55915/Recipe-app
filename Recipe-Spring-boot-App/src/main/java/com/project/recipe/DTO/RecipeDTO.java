package com.project.recipe.DTO;

import com.project.recipe.model.IndexStep;
import com.project.recipe.model.Recipe;

import java.util.Arrays;

public class RecipeDTO {

    private Recipe recipe;

    private IndexStep[] steps;

    public RecipeDTO(Recipe recipe, IndexStep[] steps) {
        this.recipe = recipe;
        this.steps = steps;
    }

    public RecipeDTO() {
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public IndexStep[] getSteps() {
        return steps;
    }

    public void setSteps(IndexStep[] steps) {
        this.steps = steps;
    }

    @Override
    public String toString() {
        return "RecipeDTO{" +
                "recipe=" + recipe +
                ", steps=" + Arrays.toString(steps) +
                '}';
    }
}
