/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.creational.abstractfactory;

import com.zenzile.designpatternss.creational.factory.Animal;


/**
 *
 * @author SIHLE
 */
public class Dragon extends Animal{

   
    @Override
    public String makeSound() {
        return "Roar!";
    }
    
}
