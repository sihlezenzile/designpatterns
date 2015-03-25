/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.behavioral.visitor;

import java.util.List;

/**
 *
 * @author SIHLE
 */
public class SumVisitor implements NumberVisitor{

    @Override
    public void visit(TwoElement twoElement) {
    
    }

    @Override
    public void visit(ThreeElement threeElement) {
    
    }

    @Override
    public void visit(List<NumberElement> elementList) {
   for(NumberElement ne : elementList)
       ne.accept(this);
    }
    
}
