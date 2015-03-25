/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.behavioral.template;

/**
 *
 * @author SIHLE
 */
public abstract class Meal {
    public final String doMeal(){
       return prepareIngredients()+ cook()+ eat()+ cleanUp();
    }
    public abstract String prepareIngredients();
    public abstract String cook();
    public String eat()
    {
        return " MmM, thats good";
    }
    public abstract String cleanUp();
}
