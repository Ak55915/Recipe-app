package com.project.recipe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "recipes")
public class Recipe {

    @Id
    @Column(name = "recipe_id")
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int recipeId;
    @Column(name = "recipe_name")
    private String recipeName;
    @Column(name = "recipe_image")
    private String recipeImage;
    @Column(name = "time_required_to_prepare")
    private String timeRequiredToPrepare;
    @Column(name = "rating_for_difficulty_and_quality")
    private float ratingForDifficultyAndQuality;
    @Column(name = "ingredients_description")
    private String ingredientsDescription;

    public Recipe(int recipeId, String recipeName, String recipeImage, String timeRequiredToPrepare, float ratingForDifficultyAndQuality, String ingredientsDescription) {
        this.recipeId = recipeId;
        this.recipeName = recipeName;
        this.recipeImage = recipeImage;
        this.timeRequiredToPrepare = timeRequiredToPrepare;
        this.ratingForDifficultyAndQuality = ratingForDifficultyAndQuality;
        this.ingredientsDescription = ingredientsDescription;
    }

    public Recipe(String recipeName, String recipeImage, String timeRequiredToPrepare, float ratingForDifficultyAndQuality, String ingredientsDescription) {
        this.recipeName = recipeName;
        this.recipeImage = recipeImage;
        this.timeRequiredToPrepare = timeRequiredToPrepare;
        this.ratingForDifficultyAndQuality = ratingForDifficultyAndQuality;
        this.ingredientsDescription = ingredientsDescription;
    }

    public Recipe() {
    }

    public int getRecipeId() {
        return recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public String getRecipeImage() {
        return recipeImage;
    }

    public String getTimeRequiredToPrepare() {
        return timeRequiredToPrepare;
    }

    public float getRatingForDifficultyAndQuality() {
        return ratingForDifficultyAndQuality;
    }

    public String getIngredientsDescription() {
        return ingredientsDescription;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public void setRecipeImage(String recipeImage) {
        this.recipeImage = recipeImage;
    }

    public void setTimeRequiredToPrepare(String timeRequiredToPrepare) {
        this.timeRequiredToPrepare = timeRequiredToPrepare;
    }

    public void setRatingForDifficultyAndQuality(float ratingForDifficultyAndQuality) {
        this.ratingForDifficultyAndQuality = ratingForDifficultyAndQuality;
    }

    public void setIngredientsDescription(String ingredientsDescription) {
        this.ingredientsDescription = ingredientsDescription;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "recipeId=" + recipeId +
                ", recipeName='" + recipeName + '\'' +
                ", recipeImage='" + recipeImage + '\'' +
                ", timeRequiredToPrepare='" + timeRequiredToPrepare + '\'' +
                ", ratingForDifficultyAndQuality=" + ratingForDifficultyAndQuality +
                ", ingredientsDescription='" + ingredientsDescription + '\'' +
                '}';
    }
}
