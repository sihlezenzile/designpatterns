/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.behavioral.observer;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author SIHLE
 */
public class WeatherStation implements WeatherSubject{
    Set<WeatherObserver> weatherObservers;
    int temperature;
    
    public WeatherStation(int temperature){
        weatherObservers = new HashSet<WeatherObserver>();
        this.temperature = temperature;
    }

   
    public void addObserver(WeatherObserver weatherObserver) {
       weatherObservers.add(weatherObserver);
    }

    
    public void removeObserver(WeatherObserver weatherObserver) {
    weatherObservers.remove(weatherObserver);
    }

   
    public void doNotify() {
   Iterator<WeatherObserver> it = weatherObservers.iterator();
   while(it.hasNext()){
       WeatherObserver weatherObserver = it.next();
       weatherObserver.doUpdate(temperature);
   }
    }
   public void setTemperature(int newTemperature)
   {
       temperature = newTemperature;
       doNotify();
   }
   public int getTemperature(){
       return temperature;
   }
}
