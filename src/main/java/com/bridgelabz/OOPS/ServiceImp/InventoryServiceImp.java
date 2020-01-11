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

	@SuppressWarnings("unchecked")
	public void writeData() {
		
		Scanner scanner = new Scanner(System.in);	//	scanner to get user input
		String[] names = new String[] {"Rice" , "Wheat" , "Pulses"};	//	inventory array
		
		JSONObject finalObject = new JSONObject();	//	json object to write data
		for (String name : names) {	//	getting data for every inventory
			System.out.print("Enter number of types of " + name + " : ");
			int count = scanner.nextInt();	//	types of every inventory
			JSONArray array = new JSONArray();	//	array to store types
			
			for(int i = 0; i < count; i++) {	//	 object for every type
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
			printWriter = new PrintWriter("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/inventory.json");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		printWriter.write(finalObject.toJSONString());
		printWriter.close();
		
	}

	@Override
 public void readData() {
		
		JSONArray array = new JSONArray();	//	array to get json data from file
		JSONParser parser = new JSONParser();	//	parser to parse data from file
		JSONObject object;// json object to store every type of inventory
	
		
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
