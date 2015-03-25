/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.structural.adapter;

import com.zenzile.designpatternss.structural.adapter.TemperatureClassReporter;
import com.zenzile.designpatternss.structural.adapter.TemperatureInfo;
import com.zenzile.designpatternss.structural.adapter.TemperatureObjectReporter;
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
public class AdapterTest {
    
    public AdapterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testAdapter()
    {
        TemperatureInfo tempInfo = (TemperatureInfo) new TemperatureClassReporter();
        tempInfo.setTemperatureInC(10);
        assertEquals(tempInfo.getTemperatureInC(), 10.0);
        assertEquals(tempInfo.getTemperatureInF(), 50.0);
         
        tempInfo = new TemperatureObjectReporter();
        tempInfo.setTemperatureInf(85);
        assertEquals(tempInfo.getTemperatureInC(), 29.444444444444443);
        assertEquals(tempInfo.getTemperatureInF(), 85.0);
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
