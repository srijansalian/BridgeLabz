package com.bridgelabz.DesignPattern.Creational.Singleton;

public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance==null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
	
	/*
	 * Double checking the synchronized
	 */
	public static ThreadSafeSingleton  Doublechecking() {
		if(instance==null) {
			synchronized(ThreadSafeSingleton.class) {
				if(instance==null) {
					instance = new ThreadSafeSingleton();
					
				}
			}
		} return instance;
	}
}
