package com.bridgelabz.DesignPattern.Creational.Singleton;
import java.lang.reflect.Constructor;
public class RefelectionSingleton {
    public static void main(String[] args) {
        EagerInitializedSingleton One = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton Two = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //This will Destroy the singleton pattern
                constructor.setAccessible(true);
                Two = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(One.hashCode());
        System.out.println(Two.hashCode());
    }

}



