package com.bridgelabz.OOPS.ServiceImp;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import com.bridgelabz.OOPS.Controller.*;
import com.bridgelabz.OOPS.Model.InventoryManModel;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.OOPS.Service.*;
import com.bridgelabz.util.util;
public class InventoryManServiceImp implements InventoryManInf {
	@SuppressWarnings("unchecked")
	/*
	 * Method to write JSON Object
	 */
	public void writeData() {
		
		
		String[] names = new String[] {"Rice" , "Wheat" , "Pulses"};	
		Scanner scanner = new Scanner(System.in);
		JSONObject finalObject = new JSONObject();	//Creating of an Object
		for (String name : names) {	
			System.out.print("Enter number of types of " + name + " : ");
			int count = util.inputInteger();	
			JSONArray array = new JSONArray();	
			
			for(int i = 0; i < count; i++) {	
				JSONObject jsonObject  = new JSONObject();
				System.out.print("Enter name, weight and price: ");
				jsonObject.put("name", util.inputInteger());    // Accepting the user Inputs
				jsonObject.put("weight", util.inputInteger());
				jsonObject.put("price", util.inputInteger());
				System.out.println("=================================================================");
				array.add(jsonObject); //Inserting the JSONObject into an JSONArray
			}			
			finalObject.put(name , array);
		}
		scanner.close();
		PrintWriter printWriter = null;	//	to write data to the file
		try {
			printWriter = new PrintWriter("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/InventoryMAN.json");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		printWriter.write(finalObject.toJSONString());//Used to write into an file
		printWriter.close();
		
	}

	@Override
	/*
	 * Method to read the JSON Object 
	 * Calculate the Grand total
	 */
 public void readData() {
		
		JSONArray array = new JSONArray();	
		
		JSONParser parser = new JSONParser();	
		JSONObject object;
		long a,b,c = 0;
		long grand;
	
		
		try {
			InventoryManModel Inmodel = new InventoryManModel();
			object = (JSONObject) parser.parse(new FileReader("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/inventory.json"));
			array = (JSONArray) object.get("Rice");
			System.out.println("Rice inventory value: " + Inventoryy.getValue(array)); //Method used to calculate Inventory total and return the value
			a = Inventoryy.getValue(array); 
			array = (JSONArray) object.get("Pulses");
			System.out.println("Pulses inventory value: " + Inventoryy.getValue(array));
			b = Inventoryy.getValue(array);
			array = (JSONArray) object.get("Wheat");
			System.out.println("Wheat inventory value: " +Inventoryy.getValue(array));
			c = Inventoryy.getValue(array);
			grand=a+b+c;   // To find out the grand total
			Inmodel.setGrand(grand);
			//Display the Grand Total
			System.out.println("The Grand Total of an Inventory is : "+Inmodel.getGrand());
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		
	}

	
}
