/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.behavioral.chainofresposibility;

/**
 *
 * @author SIHLE
 */
public class EarthHandler extends PlanetHandler{
     @Override
     public String handleRequest(PlanetEnum request){
        if(request== PlanetEnum.EARTH){
            return "earth";
        }
        else
            return successor.handleRequest(request);
    }
}
