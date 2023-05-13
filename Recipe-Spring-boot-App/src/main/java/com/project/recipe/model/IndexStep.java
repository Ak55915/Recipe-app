package com.project.recipe.model;

import jakarta.persistence.*;

@Entity
@Table(name = "index_steps")
public class IndexStep {

    @Id
    @Column(name = "index_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int indexId;
    @Column(name = "step_id")
    private int stepId;
    @Column(name = "step_description")
    private String stepDescription;
    @Column(name = "step_image")
    private String stepImage;
    @Column(name = "recipe_id")
    private int recipeId;

    public IndexStep() {
    }

    public IndexStep(int indexId, int stepId, String stepDescription, String stepImage, int recipeId) {
        this.indexId = indexId;
        this.stepId = stepId;
        this.stepDescription = stepDescription;
        this.stepImage = stepImage;
        this.recipeId = recipeId;
    }

    public IndexStep(int stepId, String stepDescription, String stepImage, int recipeId) {
        this.stepId = stepId;
        this.stepDescription = stepDescription;
        this.stepImage = stepImage;
        this.recipeId = recipeId;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }

    public int getStepId() {
        return stepId;
    }

    public void setStepId(int stepId) {
        this.stepId = stepId;
    }

    public String getStepDescription() {
        return stepDescription;
    }

    public void setStepDescription(String stepDescription) {
        this.stepDescription = stepDescription;
    }

    public String getStepImage() {
        return stepImage;
    }

    public void setStepImage(String stepImage) {
        this.stepImage = stepImage;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }

    @Override
    public String toString() {
        return "IndexStep{" +
                "indexId=" + indexId +
                ", stepId=" + stepId +
                ", stepDescription='" + stepDescription + '\'' +
                ", stepImage='" + stepImage + '\'' +
                ", recipeId=" + recipeId +
                '}';
    }
}
