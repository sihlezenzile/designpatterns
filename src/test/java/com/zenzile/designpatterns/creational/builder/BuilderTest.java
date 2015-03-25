/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.creational.builder;

import com.zenzile.designpatternss.creational.builder.ItalianMealBuilder;
import com.zenzile.designpatternss.creational.builder.Meal;
import com.zenzile.designpatternss.creational.builder.MealBuilder;
import com.zenzile.designpatternss.creational.builder.MealDirector;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author SIHLE
 */
public class BuilderTest {
    
    public BuilderTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testBuilder()
    {
         MealBuilder mealBuilder = new ItalianMealBuilder() {};
         MealDirector mealDirector = new MealDirector(mealBuilder);
         mealDirector.ConstructMeal();
         Meal meal = mealDirector.getMeal();
         assertEquals(meal.getFood(), "Pizza");
    }
    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
