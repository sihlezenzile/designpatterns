/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.behavioral.template;

import com.zenzile.designpatternss.behavioral.template.BurgerMeal;
import com.zenzile.designpatternss.behavioral.template.CheeseBurgerMeal;
import com.zenzile.designpatternss.behavioral.template.Meal;
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
public class TemplateTest {
    
    public TemplateTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testTemplate()
    {
        Meal meal1 = new BurgerMeal();
        Meal meal2 = new CheeseBurgerMeal();
        assertEquals(meal1.doMeal(), " get burger cooking burger MmM, thats good cleaning");
        assertEquals(meal2.doMeal(), " get cheese cooking yumclean");
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
