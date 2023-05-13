package com.project.recipe.controller;

import com.project.recipe.model.IndexStep;
import com.project.recipe.service.IndexStepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/indexSteps")
@CrossOrigin("*")
public class IndexStepController {

    @Autowired
    private IndexStepService indexStepService;

    @GetMapping("/getRecipe/{recipeId}")
    public ResponseEntity<List<IndexStep>> getSteps(@PathVariable int recipeId) {
        return new ResponseEntity<>(indexStepService.getRecipeSteps(recipeId), HttpStatus.OK);
    }

}
