package com.project.recipe.controller;

import com.project.recipe.DTO.RecipeDTO;
import com.project.recipe.model.Recipe;
import com.project.recipe.service.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/recipe")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;


    @GetMapping("/fetchAllRecipes")
    public ResponseEntity<List<Recipe>> getAllRecipes() {
        return new ResponseEntity<>(recipeService.fetchAllRecipes(), HttpStatus.OK);
    }

    @PostMapping("/saveRecipe")
    public ResponseEntity<String> addRecipe(@RequestBody RecipeDTO recipeDTO) {
        return new ResponseEntity<>(recipeService.saveRecipe(recipeDTO), HttpStatus.CREATED);
    }

    @GetMapping("/getRecipe/{recipeID}")
    public ResponseEntity<Recipe> getRecipeByID(@PathVariable int recipeID) {
        return new ResponseEntity<>(recipeService.getRecipeById(recipeID), HttpStatus.OK);
    }

    @PutMapping("/updateRecipe")
    public ResponseEntity<String> updateRecipe(@RequestBody Recipe newRecipe) {
        return new ResponseEntity<>(recipeService.updateRecipe(newRecipe), HttpStatus.OK);
    }

    @DeleteMapping("/deleteRecipe/{recipeId}")
    public ResponseEntity<String> deleteRecipe(@PathVariable int recipeId) {
        return new ResponseEntity<>(recipeService.deleteRecipe(recipeId), HttpStatus.OK);
    }


}
