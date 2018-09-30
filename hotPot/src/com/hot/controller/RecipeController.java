package com.hot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hot.model.Recipe;
import com.hot.service.RecipeService;


@Controller
@RequestMapping("/recipe")
public class RecipeController {

	@Autowired
	@Qualifier("recipeService")
	private RecipeService recipeService;
	
	@RequestMapping("/recipeList.do")
	public ModelAndView recipeList(){
		ModelAndView mv = new ModelAndView();
		List<Recipe> recipeList = recipeService.getRecipes();
		System.out.println(recipeList);
		mv.addObject("recipeList", recipeList);
		mv.setViewName("table-list-img");
		return mv;
		
	}
}
