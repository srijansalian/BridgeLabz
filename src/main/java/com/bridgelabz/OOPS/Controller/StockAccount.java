package com.bridgelabz.OOPS.Controller;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.OOPS.ServiceImp.StockAccountImp;
import com.bridgelabz.datastructure.Stack;
public class StockAccount {
	private static File file;
	private static FileWriter fileWriter;
	private static FileReader fileReader;
	static Scanner sc = new Scanner(System.in);
	@SuppressWarnings("unchecked")
	public static void stockReport() {
		// TODO Auto-generated method stub
		JSONObject object = new JSONObject();

		System.out.println("Enter number of stocks:");
		int numberOfStock = sc.nextInt();
		// object.put("Number Of Stocks", numberOfStock);

		JSONArray stockArray = new JSONArray();
		for (int i = 0; i < numberOfStock; i++) {
			JSONObject object1 = new JSONObject();

			System.out.println("\n" + "Enter Name of Company:");
			String shareName = sc.next();
			object1.put("Share Name:", shareName);

			System.out.println("Enter the Price of shares:");
			int sharePrice = sc.nextInt();
			object1.put("Share Price:", sharePrice);

			System.out.println("Enter Number of shares");
			int numberOfShares = sc.nextInt();
			object1.put("Numberofshares", numberOfShares);

			int totalValue = sharePrice * numberOfShares;
			object1.put("Total Value of stock:", totalValue);

			stockArray.add(object1);

			System.out.println("\n" + "*****Stock Report*****" + "\n");
			System.out.println("Company Name       : " + shareName);
			System.out.println("Share Price        : " + sharePrice);
			System.out.println("Number of Shares   : " + numberOfShares);
			System.out.println("Total Cost of Share: " + (totalValue));
		}
		object.put("Stock Details:", stockArray);
		// System.out.println("\n" +"Total value of Stock.." +
		// object.add(totalValue));

		try {
			fileWriter = new FileWriter("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/StockReport.json");
			fileWriter.write(object.toString());

			fileWriter.flush();
			System.out.println("\n" + "Successfully Copied JSON Object to File..");
			System.out.println("\nJSON Object: " + object);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@SuppressWarnings("unchecked")
	public static void companyShares() throws IOException, org.json.simple.parser.ParseException {
		// TODO Auto-generated method stub
		file = new File("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/StockReport.json");
		fileReader = new FileReader(file);

		// initialize JSon parser
		JSONParser parser = new JSONParser();

		// create a JSon array parse the file
		JSONArray jsonArray = (JSONArray) parser.parse(fileReader);
		// System.out.println(jsonArray.size());

		// create a JSon object
		JSONObject jsonObject = new JSONObject();

		System.out.println("Enter Your Share symbol ex:'@','#','$':");
		String ShareSymbol =sc.next();
		jsonObject.put("ShareSymbol", ShareSymbol);

		System.out.println("Enter price of share:");
		int price = sc.nextInt();
		jsonObject.put("SharePrice", price);

		System.out.println("Enter number of Shares you want to purchase:");
		int shareCount = sc.nextInt();
		jsonObject.put("ShareCount", shareCount);

		jsonArray.add(jsonObject);

		fileWriter = new FileWriter(file);
		// writing back JSon file to JSonArray
		fileWriter.write(JSONValue.toJSONString(jsonArray));
		fileWriter.flush();
		fileWriter.close();
	}
	public static void buyShare() throws IOException, org.json.simple.parser.ParseException {
		// TODO Auto-generated method stub
		File file1 = new File(
				"/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Stock.json");

		File file2 = new File("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Address.json");

		// check for the existence of the file
		if (file1.exists() && file2.exists()) {

			// Reading userDetails file
			fileReader = new FileReader(file1);
			JSONParser parser = new JSONParser();
			JSONArray userDetails = (JSONArray) parser.parse(fileReader);
			
			fileReader = new FileReader(file2);
			JSONParser parser1 = new JSONParser();
			JSONArray shares = (JSONArray) parser1.parse(fileReader);
			
			Iterator<?> iterator = userDetails.iterator();

			
			Iterator<?> iterator1 = shares.iterator();

			System.out.println("Enter your name Existing User:");
			String name = sc.next();

			// check in user details for next
			while (iterator.hasNext()) {

				// JSON object for userDeatils
				JSONObject object = (JSONObject) iterator.next();

				if (object.get("userName").equals(name)) {
					// System.out.println(""+object.get("userName"));

					System.out.println("Enter your share symbol you want to buy:[@,#,$,!]");
					String symbol = sc.next();
					object.put("ShareSymbol", symbol);

					Stack stack = new Stack();
					stack.push(symbol);
					// System.out.println("Stack symbol" +stack);

					// Check in company Shares share symbol
					while (iterator1.hasNext()) {

						// created object1 for Company Shares
						JSONObject object1 = (JSONObject) iterator1.next();

						if (object1.get("ShareSymbol").equals(symbol)) {
							

							System.out.println("Enter number of shares you want to buy:");
							int buy = sc.nextInt();

							
							int balance = Integer.parseInt(object.get("balance").toString());
							
							int price = Integer.parseInt(object1.get("price").toString());
							/
							int numberOfShare = Integer.parseInt(object.get("numberOfShare").toString());
							
							int shareCount = Integer.parseInt(object1.get("shareCount").toString());
							
							int newBalance = balance - (price * buy);
							
							int updateNumberOfShare = numberOfShare + buy;
							

							int shareCountCompany = shareCount - buy;
							

							object.remove("balance");
							object.remove("numberOfShare");
							object.remove("shareCount");

							object.put("balance", newBalance);
							object.put("numberOfShare", updateNumberOfShare);
							object1.put("shareCount", shareCountCompany);

							LinkedList<String> queue = new LinkedList<String>();
							Date date = new Date();
							String currentDateTime = new SimpleDateFormat("E dd/MM/yyyy. 'at' hh:mm:ss a").format(date);
							queue.add(currentDateTime);
							System.out.println("Date and Time of Share Purchase:" + " " + currentDateTime + "\n");

						}

						fileWriter = new FileWriter(file1);
						// writing back JSon file to JSonArray
						fileWriter.write(JSONValue.toJSONString(userDetails));
						fileWriter.flush();
						fileWriter.close();
					}
					fileWriter = new FileWriter(file2);
					// writing back JSon file to JSonArray
					fileWriter.write(JSONValue.toJSONString(shares));
					fileWriter.flush();
					fileWriter.close();
				}
			}
		}
	}
	public static void createUser() throws IOException, org.json.simple.parser.ParseException {

			boolean checkUser = true;
			
			file = new File("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Stock.json");
			
			fileReader = new FileReader(file);
			
			// initialize JSon parser
			JSONParser parser = new JSONParser();
			
			// create a JSon array parse the file
			JSONArray jsonArray = (JSONArray) parser.parse(fileReader);
			// System.out.println(jsonArray.size());
			
			// create a JSon object
			JSONObject jsonObject = new JSONObject();
			
			// input values from user add to JSOn object
			System.out.println("Enter First Name");
			String name = sc.next();
			jsonObject.put("userName", name);
			
			System.out.println("Enter Number of Shares");
			String numberOfShare = sc.next();
			jsonObject.put("numberOfShare", numberOfShare);
			
			System.out.println("Enter your balance");
			String balance = sc.next();
			jsonObject.put("balance", balance);
			
			// all values of object adding to JSOn array
			jsonArray.add(jsonObject);
			
			if (checkUser) {
			fileWriter = new FileWriter(file);
			// writing back JSon file to JSonArray
			fileWriter.write(jsonArray.toJSONString());
			fileWriter.flush();
			fileWriter.close();
}
}
	public static void sellShare() throws Throwable {
		File file1 = new File(
				"/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Stock.json");

		File file2 = new File("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/StockReport.json");

		// check for the existence of the file
		if (file1.exists() && file2.exists()) {

			// Reading userDetails file
			fileReader = new FileReader(file1);
			JSONParser parser = new JSONParser();
			JSONArray userDetails = (JSONArray) parser.parse(fileReader);
			// System.out.println(""+userDetails);

			// Reading shares file
			fileReader = new FileReader(file2);
			JSONParser parser1 = new JSONParser();
			JSONArray shares = (JSONArray) parser1.parse(fileReader);
			// System.out.println("" +shares);

			// for userDeatils.json
			Iterator<?> iterator = userDetails.iterator();

			// for companyShares.json
			Iterator<?> iterator1 = shares.iterator();

			System.out.println("Enter your name Existing User:");
			String name =sc.next();

			// check in user details for next
			while (iterator.hasNext()) {

				// JSON object for userDeatils
				JSONObject object = (JSONObject) iterator.next();

				if (object.get("userName").equals(name)) {
					// System.out.println(""+object.get("userName"));

					System.out.println("Enter your share symbol you want to sell:[@,#,$,!]");
					String symbol = sc.next();
					object.put("ShareSymbol", symbol);

					Stack stack = new Stack();
					stack.push(symbol);

					// Check in company Shares share symbol
					while (iterator1.hasNext()) {

						// created object1 for Company Shares
						JSONObject object1 = (JSONObject) iterator1.next();

						if (object.get("ShareSymbol").equals(symbol)) {
							// System.out.println(""+object.get("ShareSymbol"));

							System.out.println("Enter number of shares you want to sell:");
							int sell = sc.nextInt();

							// get balance from user
							int balance = Integer.parseInt(object.get("balance").toString());
							

							
							int numberOfShare = Integer.parseInt(object.get("numberOfShare").toString());
							

							
							int price = Integer.parseInt(object1.get("price").toString());
							

							
							int shareCount = Integer.parseInt(object1.get("shareCount").toString());
							
							int newBalance = balance + (price * sell);
							

							int updateNumberOfShare = numberOfShare - sell;
							

							int shareCountCompany = shareCount + sell;
							
							object.remove("balance");
							object.remove("numberOfShare");
							object1.remove("shareCount");

							object.put("balance", newBalance);
							object.put("numberOfShare", updateNumberOfShare);
							object1.put("shareCount", shareCountCompany);

							LinkedList<String> queue = new LinkedList<String>();
							Date date = new Date();
							String currentDateTime = new SimpleDateFormat("E dd/MM/yyyy. 'at' hh:mm:ss a").format(date);
							queue.add(currentDateTime);
							System.out.println("Date and Time of Share sold:" + " " + currentDateTime + "\n");

						}

						fileWriter = new FileWriter(file1);
						// writing back JSon file to JSonArray
						fileWriter.write(JSONValue.toJSONString(userDetails));
						fileWriter.flush();
						fileWriter.close();
					}
					fileWriter = new FileWriter(file2);
					// writing back JSon file to JSonArray
					fileWriter.write(JSONValue.toJSONString(shares));
					fileWriter.flush();
					fileWriter.close();
				}
			}
		}
	}


	public static void main(String[] args) {
		//stockReport();
		//companyShares();
		System.out.println("Enter the choice");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
			createUser();
			break;
		}
		
		

	}

}
