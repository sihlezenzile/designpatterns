/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.behavioral.state;

/**
 *
 * @author SIHLE
 */
public class HappyState implements EmotionalState{

    @Override
    public String sayHello() {
      return "Molo friend";
    }

    @Override
    public String sayGoodbye() {
    return "Bye friend";
    }
    
}
