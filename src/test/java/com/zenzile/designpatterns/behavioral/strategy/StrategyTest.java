/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.behavioral.strategy;

import com.zenzile.designpatternss.behavioral.strategy.Context;
import com.zenzile.designpatternss.behavioral.strategy.HikeStrategy;
import com.zenzile.designpatternss.behavioral.strategy.SkiStrategy;
import com.zenzile.designpatternss.behavioral.strategy.Strategy;
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
public class StrategyTest {
    
    public StrategyTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testStrategy()
    {
       
        int temperatureInF = 60;

        Strategy skiStrategy = new SkiStrategy();
        Context context = new Context(40 , skiStrategy);

        Assert.assertTrue(skiStrategy.checkTemperature(32));

        Strategy hikeStrategy = new HikeStrategy();
        context.setStrategy(hikeStrategy);

        Assert.assertEquals(context.getTemperatureInF(), 40);
        Assert.assertEquals(context.getResult(), false);
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
