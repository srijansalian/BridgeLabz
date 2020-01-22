package com.bridgelabz.DesignPattern.Creational.Singleton;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
public class SingleTonTest {
	    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	    	SerilizationSingleton instanceOne = SerilizationSingleton.getInstance();
	        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.text"));
	        out.writeObject(instanceOne);
	        out.close();
	        
	        //deserailize from file to object
	        ObjectInput in = new ObjectInputStream(new FileInputStream("filename.text"));
	        SerilizationSingleton instanceTwo = (SerilizationSingleton) in.readObject();
	        in.close();
	        
	        System.out.println("Instance 1 hashCode="+instanceOne.hashCode());
	        System.out.println("Instance 2 hashCode="+instanceTwo.hashCode());
	        
	    }

	}



