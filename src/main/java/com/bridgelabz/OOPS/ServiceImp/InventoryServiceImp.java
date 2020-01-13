package com.bridgelabz.OOPS.ServiceImp;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import com.bridgelabz.OOPS.Controller.*;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.OOPS.Service.*;
public class InventoryServiceImp implements InventoryInf{
/**
 * Method to write a JSON file                                                                                                        
 */
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
				jsonObject.put("weight", scanner.nextLong());
				jsonObject.put("price", scanner.nextLong());
				System.out.println("=================================================================");
				array.add(jsonObject);
			}			
			finalObject.put(name , array);
		}
		scanner.close();
		PrintWriter printWriter = null;	
		try {
			printWriter = new PrintWriter("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Inventory.json");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		printWriter.write(finalObject.toJSONString());
		printWriter.close();
		
	}
	/**
	 * Method to read JSON file 
	 * Calculate the total 
	 */

	@Override
 public void readData() {
		
		JSONArray array = new JSONArray();	
		JSONParser parser = new JSONParser();	
		JSONObject object;
	
		
		try {
			object = (JSONObject) parser.parse(new FileReader("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/inventory.json"));
			array = (JSONArray) object.get("Rice");
			System.out.println("Rice inventory value: " + Inventoryy.getValue(array));
			
			array = (JSONArray) object.get("Pulses");
			System.out.println("Pulses inventory value: " + Inventoryy.getValue(array));
			
			array = (JSONArray) object.get("Wheat");
			System.out.println("Wheat inventory value: " +Inventoryy.getValue(array));
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
