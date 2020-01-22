package com.bridgelabz.DesignPattern.Creational.Singleton;

import java.io.Serializable;

public class SerilizationSingleton implements Serializable {
	
	private static final long serial = -754254585L;
	 
	private SerilizationSingleton() {}
	
	private static class Serlization{
		private static SerilizationSingleton INSTANCE = new SerilizationSingleton();
	}
	
	public static SerilizationSingleton getInstance() {
		return Serlization.INSTANCE;
	}
	
	

}
