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
public class JapaneseMealBuilder implements MealBuilder 
{
     private Meal meal;
    
    public JapaneseMealBuilder()
    {
        meal = new Meal();
    }
    
    public void buildDrink()
    {
        meal.setDrink("Sake");
    }
    
    public void buildFood()
    {
        meal.setFood("Sushi");
    }
    
    public Meal getMeal()
    {
        return meal;
    }
    
    
}
