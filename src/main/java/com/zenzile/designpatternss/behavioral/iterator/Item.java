/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.behavioral.iterator;

/**
 *
 * @author SIHLEs
 */
public class Item {
    String name;
    float price;
    
    public Item(String name, float price){
        this.name= name;
        this.price=price;
    }
    @Override
    public String toString(){
        return name+ ":R" + price;
        //return name;
    }
}
