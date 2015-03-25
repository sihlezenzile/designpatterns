/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.behavioral.chainofresposibility;

import com.zenzile.designpatternss.behavioral.chainofresposibility.EarthHandler;
import com.zenzile.designpatternss.behavioral.chainofresposibility.MercuryHandler;
import com.zenzile.designpatternss.behavioral.chainofresposibility.PlanetEnum;
import com.zenzile.designpatternss.behavioral.chainofresposibility.PlanetHandler;
import com.zenzile.designpatternss.behavioral.chainofresposibility.SetChain;
import com.zenzile.designpatternss.behavioral.chainofresposibility.VenusHandler;
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
public class ChainofresponsilityTest {
    
    public ChainofresponsilityTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testChain()
    {
        PlanetHandler chain = SetChain.setUpChain();
        
        assertEquals(chain.handleRequest(PlanetEnum.VENUS), "venus");
        assertEquals(chain.handleRequest(PlanetEnum.MERCURY),"mercury");
        assertEquals(chain.handleRequest(PlanetEnum.EARTH),"earth");
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
