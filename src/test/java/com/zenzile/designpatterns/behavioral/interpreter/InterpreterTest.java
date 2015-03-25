/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatterns.behavioral.interpreter;

import com.zenzile.designpatternss.behavioral.interpreter.Expression;
import static com.zenzile.designpatternss.behavioral.interpreter.InterpreterDemo.getMaleExpression;
import static com.zenzile.designpatternss.behavioral.interpreter.InterpreterDemo.getMarriedWomanExpression;
import com.zenzile.designpatternss.behavioral.interpreter.TerminalExpression;
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
public class InterpreterTest {
    
    public InterpreterTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void interpreterTest()
    {
   //Rule: Robert and John are male

      /*Expression robert = new TerminalExpression("sihle");
      Expression john = new TerminalExpression("zenzile");		
   
      Expression julie = new TerminalExpression("Amanda");
      Expression married = new TerminalExpression("Married");*/
      
      Expression isMale = getMaleExpression();
      Expression isMarriedWoman = getMarriedWomanExpression();

      Assert.assertTrue(isMale.interpret("sihle"));
      Assert.assertTrue(isMarriedWoman.interpret("Married Amanda"));
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
