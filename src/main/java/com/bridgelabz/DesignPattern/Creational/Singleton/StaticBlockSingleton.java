package com.bridgelabz.DesignPattern.Creational.Singleton;

public class StaticBlockSingleton {
	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	static {
		try { 
			instance = new StaticBlockSingleton();
			
		}catch(Exception e) {
			throw new RuntimeException("Exception handling");
		}
		}

	public StaticBlockSingleton getInstance() {
		return instance;
	}
}
