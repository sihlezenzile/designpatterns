/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.behavioral.iterator;

import com.zenzile.designpatternss.behavioral.iterator.Item;
import com.zenzile.designpatternss.behavioral.iterator.Menu;
import java.util.Iterator;
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
public class IteratorTest {
    
    public IteratorTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testIterator()
    {
        Item i1 = new Item("bread", 10.00f);
        Item i2 = new Item("butter", 15.00f);
        Item i3 = new Item("cheese", 12.50f);

        Menu menu = new Menu();
        menu.addItem(i1);
        menu.addItem(i2);
        menu.addItem(i3);
     
        Iterator<Item> iterator = menu.iterator();


        Item item = iterator.next();          
        assertTrue(item.equals(i1));

        item = iterator.next();
        assertTrue(item.equals(i2));
        
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
