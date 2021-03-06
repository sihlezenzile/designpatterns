/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.creational.abstractfactory;

import com.zenzile.designpatternss.creational.abstractfactory.AbstractFactory;
import com.zenzile.designpatternss.creational.abstractfactory.SpeciesFactory;
import com.zenzile.designpatternss.creational.factory.Animal;
import org.testng.Assert;
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
public class AbstractFactoryTest {
    
    public AbstractFactoryTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAbstract()
    {
         AbstractFactory abstractFact = new AbstractFactory();
         SpeciesFactory speciesFactR = abstractFact.getSpeciesFactory("Reptile");
         
         Animal drag = speciesFactR.getAnimal("Dragon");
         Assert.assertEquals(drag.makeSound(), "Roar!", "Run Forrest, Run");
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
