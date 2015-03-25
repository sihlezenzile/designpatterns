/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.structural.flyweight;

import com.zenzile.designpatternss.structural.flyweight.Flyweight;
import com.zenzile.designpatternss.structural.flyweight.FlyweightFactory;
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
public class FlyweightTest {
    
    public FlyweightTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testFly()
    {
        FlyweightFactory flyweightFactory = FlyweightFactory.getInstance();
        Flyweight flyweightAdder = flyweightFactory.getFlyweight("add");
        Flyweight flyweightmult = flyweightFactory.getFlyweight("multiply");
        assertEquals(flyweightAdder.doMath(2, 3), 5);
        assertEquals(flyweightmult.doMath(2, 3), 6);
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
