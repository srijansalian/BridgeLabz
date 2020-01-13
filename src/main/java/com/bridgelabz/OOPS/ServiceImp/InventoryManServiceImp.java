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
public class InventoryManServiceImp implements InventoryManInf {
	@SuppressWarnings("unchecked")
	public void writeData() {
		
		Scanner scanner = new Scanner(System.in);	
		String[] names = new String[] {"Rice" , "Wheat" , "Pulses"};	
		
		JSONObject finalObject = new JSONObject();	
		for (String name : names) {	
			System.out.print("Enter number of types of " + name + " : ");
			int count = scanner.nextInt();	
			JSONArray array = new JSONArray();	
			
			for(int i = 0; i < count; i++) {	
				JSONObject jsonObject  = new JSONObject();
				System.out.print("Enter name, weight and price: ");
				jsonObject.put("name", scanner.next());
				jsonObject.put("weight", scanner.nextInt());
				jsonObject.put("price", scanner.nextInt());
				System.out.println("=================================================================");
				array.add(jsonObject);
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
		printWriter.write(finalObject.toJSONString());
		printWriter.close();
		
	}

	@Override
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
			System.out.println("Rice inventory value: " + Inventoryy.getValue(array));
			a = Inventoryy.getValue(array);
			array = (JSONArray) object.get("Pulses");
			System.out.println("Pulses inventory value: " + Inventoryy.getValue(array));
			b = Inventoryy.getValue(array);
			array = (JSONArray) object.get("Wheat");
			System.out.println("Wheat inventory value: " +Inventoryy.getValue(array));
			c = Inventoryy.getValue(array);
			grand=a+b+c;
			Inmodel.setGrand(grand);
			
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
