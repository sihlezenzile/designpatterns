/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.creational.prototype;

/**
 *
 * @author SIHLE
 */
public class Bird implements Prototype{
    
    String colour;
    public Bird(String col)
    {
        this.colour = col;
    }

    @Override
    public Prototype doClone() { 
        return new Bird(colour);
    }
    
    @Override
    public String toString()
    {
        return colour;
    }
}
