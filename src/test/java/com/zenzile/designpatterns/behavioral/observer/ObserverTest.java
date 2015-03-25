/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.behavioral.observer;

import com.zenzile.designpatternss.behavioral.observer.WeatherCustomer1;
import com.zenzile.designpatternss.behavioral.observer.WeatherCustomer2;
import com.zenzile.designpatternss.behavioral.observer.WeatherStation;
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
public class ObserverTest {
    
    public ObserverTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
     public void testObserver() {
     
         WeatherStation weatherStation = new WeatherStation(33);
         WeatherCustomer1 weatherstation1 = new WeatherCustomer1();
         WeatherCustomer2 weatherstation2 = new WeatherCustomer2();
         weatherStation.addObserver(weatherstation1);
         weatherStation.addObserver(weatherstation2);
         
         weatherStation.setTemperature(34);
         weatherStation.removeObserver(weatherstation1);
         weatherStation.setTemperature(23);
         assertEquals(weatherStation.getTemperature(), 23);
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
