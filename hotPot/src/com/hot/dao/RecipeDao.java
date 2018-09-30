package com.hot.dao;

import java.util.List;
import com.hot.model.Recipe;

public interface RecipeDao {
	public List<Recipe> getRecipes();
	public int addRecipe(Recipe recipe);
}
