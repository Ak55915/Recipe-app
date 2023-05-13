package com.project.recipe.repository;

import com.project.recipe.model.IndexStep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexStepRepository extends JpaRepository<IndexStep, Integer> {

    @Query(value = "select * from index_steps where recipe_id= ?1 order by step_id asc", nativeQuery = true)
    List<IndexStep> getAllStepsOfRecipe(int recipeId);

    @Query(value = "delete from index_steps where recipe_id= ?1", nativeQuery = true)
    void deleteAllStepsOfRecipe(int recipeId);
}
