/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.behavioral.interpreter;

/**
 *
 * @author SIHLE
 */
public class InterpreterDemo {

   //Rule: Robert and John are male
   public static Expression getMaleExpression(){
      Expression robert = new TerminalExpression("sihle");
      Expression john = new TerminalExpression("zenzile");
      return new OrExpression(robert, john);		
   }

   //Rule: Julie is a married women
   public static Expression getMarriedWomanExpression(){
      Expression julie = new TerminalExpression("Amanda");
      Expression married = new TerminalExpression("Married");
      return new AndExpression(julie, married);		
   }
}
