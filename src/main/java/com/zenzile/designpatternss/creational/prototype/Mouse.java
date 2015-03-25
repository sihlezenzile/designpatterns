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
public class Mouse implements Prototype{
    
    String name;
    public Mouse(String n)
    {
        this.name = n;
    }

    @Override
    public Prototype doClone() {
        return new Mouse(name);
    }
    @Override
    public String toString()
    {
        return name;
    }
}
