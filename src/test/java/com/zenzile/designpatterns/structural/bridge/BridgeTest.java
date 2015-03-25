/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.structural.bridge;

import com.zenzile.designpatternss.structural.bridge.BigBus;
import com.zenzile.designpatternss.structural.bridge.BigEngine;
import com.zenzile.designpatternss.structural.bridge.SmallCar;
import com.zenzile.designpatternss.structural.bridge.SmallEngine;
import com.zenzile.designpatternss.structural.bridge.Vehicle;
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
public class BridgeTest {
    
    public BridgeTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testBridge()
    {
        Vehicle vehicle = new BigBus(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "slow");
        
        vehicle.setEngine(new BigEngine());
        Assert.assertEquals(vehicle.drive(), "slow");

        vehicle = new SmallCar(new SmallEngine());
        Assert.assertEquals(vehicle.drive(), "average");   
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
