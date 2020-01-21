package com.bridgelabz.DesignPattern.Creational.Singleton;

public class LazyinitializedSingleton {
	private static LazyinitializedSingleton instance;
	
	private LazyinitializedSingleton() {}
	
	public static LazyinitializedSingleton getInstance() {
		if(instance==null) {
			instance = new LazyinitializedSingleton();
		}
		return instance;
	}

}
