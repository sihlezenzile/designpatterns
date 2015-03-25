/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.creational.abstractfactory;

import com.zenzile.designpatternss.creational.factory.Animal;
import com.zenzile.designpatternss.creational.factory.Cat;
import com.zenzile.designpatternss.creational.factory.Dog;



/**
 *
 * @author SIHLE
 */
public class MammalFactory extends SpeciesFactory{
 
    public Animal getAnimal(String type){
        if("Canine".equals(type))
            return new Dog();
        else
            return new Cat();
    }
}