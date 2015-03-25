/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.creational.factory;

/**
 *
 * @author SIHLE
 */
public class AccomodationFactory {
    
    public Accomodation getMealType(String type)
    {
        if(type.equals("Seafood"))
            return new Hotel();
        else
            return new BnB();
    }
    
}
