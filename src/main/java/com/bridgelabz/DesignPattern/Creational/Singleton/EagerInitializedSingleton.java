
package com.bridgelabz.DesignPattern.Creational.Singleton;

public class EagerInitializedSingleton {
    
  private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
  
  private EagerInitializedSingleton() {
}
  private static  EagerInitializedSingleton getInstance() {
	  return instance;
  }
}

