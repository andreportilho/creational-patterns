package br.com.cod3r.builder.meal.director;

import br.com.cod3r.builder.meal.builder.FastFoodMealBuilder;
import br.com.cod3r.builder.meal.model.FastFoodMeal;

public class MealDirector {

    FastFoodMealBuilder builder;

    public MealDirector(FastFoodMealBuilder builder) {
        this.builder = builder;
    }

    public void constructCombo(){
        builder.buildDrink();
        builder.buildMain();
        builder.buildSide();
        builder.buildDessert();
        builder.buildGift();
    }

    public FastFoodMeal getCombo() {return builder.getMeal();}


}
