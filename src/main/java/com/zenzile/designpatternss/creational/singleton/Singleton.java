/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.zenzile.designpatternss.creational.singleton;


/**
 *
 * @author SIHLE
 */
public class Singleton {

	private static Singleton single = null;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (single == null) {
			single = new Singleton();
		}
		return single;
	}

	public String myStatus() {
		return "Single";
	}
}
