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
public class ReptileFactory extends SpeciesFactory {
     public Animal getAnimal(String type) {
        if("Snake".equals(type))
            return new Snake();
        else
            return new Dragon();
    }
}
