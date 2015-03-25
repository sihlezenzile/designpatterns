/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.creational.builder;

/**
 *
 * @author SIHLE
 */
public abstract class ItalianMealBuilder implements MealBuilder{
    private Meal meal;
    
    public ItalianMealBuilder()
    {
        meal = new Meal();
    }
    
    public void buildDrink()
    {
        meal.setDrink("Red Wine");
    }
    
    public void buildFood()
    {
        meal.setFood("Pizza");
    }
    
    public Meal getMeal()
    {
        return meal;
    }
    
}
