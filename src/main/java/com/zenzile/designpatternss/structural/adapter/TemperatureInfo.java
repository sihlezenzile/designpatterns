/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.structural.adapter;

/**
 *
 * @author SIHLE
 */
public interface TemperatureInfo {
     public double getTemperatureInF();
    public void setTemperatureInf(double temperatureInF);
    public double getTemperatureInC();
    public void setTemperatureInC(double temperatureInC);
}
