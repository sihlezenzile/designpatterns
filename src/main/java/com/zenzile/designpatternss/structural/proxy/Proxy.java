/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.structural.proxy;

/**
 *
 * @author SIHLE
 */
public class Proxy {
    SlowThing slowthing;
    
    public Proxy()
    {
        
    }
    
    public String sayHello(){
        if(slowthing==null)
            slowthing = new SlowThing();
     return slowthing.sayHello();
    }
    
}
