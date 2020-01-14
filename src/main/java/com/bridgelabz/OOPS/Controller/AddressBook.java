package com.bridgelabz.OOPS.Controller;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.util.util;
public class AddressBook {
	static Scanner sc = new Scanner(System.in);
	void askUser() {
		System.out.println("*****************MENU***************");
		System.out.println("1.Add the Details");
		System.out.println("2.Edit the detail");
		System.out.println("3.Remove the Details");
		System.out.println("Search fot the Detail");
		System.out.println("Exit");
		int choice = sc.nextInt();
		switch(choice) {
		
		case 1 :addDetail();
				break;
				
		case 2 : Edit(); 
		
		}	
	}
	private void Edit(JSONObject jsonObject, JSONArray bookArray, int i) {
		System.out.println("Enter the option to what to edit");
	    int choice = sc.nextInt();
	    switch(choice) {
	    case 1: System.out.println("Enter the Address");
		    sc.nextLine();
			String address = sc.nextLine();
			System.out.print("Enter city, state and zip: ");
			String city = sc.next();
			String state = sc.next();
			String zip = sc.next();
			
			jsonObject.put("Address", address);
			
			jsonObject.put("City", city);
			jsonObject.put("State", state);
			jsonObject.put("Zip", zip);
		     break;
	    case 2: System.out.println("Enter phone number: ");
			String phoneNumber = sc.next();
			jsonObject.put("Phone Number", phoneNumber);
			break;
	    }	
	}
	@SuppressWarnings("unchecked")
	public static void addDetail() {
		JSONObject object = new JSONObject();
		System.out.println("Enter the First and Last Name");
		String first = sc.next();
		String last = sc.next();
		
		System.out.println("Enter the Phone Number");
		long phone = sc.nextLong();
		System.out.println("Enter the City , State and Zip");
		String city = sc.next();
		String state = sc.next();
		String zip = sc.next();
		System.out.println("Enter the Address\n");
		String address = util.InputString();
		object.put("First Name", first);
		object.put("Last Name", last);
		object.put("Address", address);
		object.put("City", city);
		object.put("State", state); 
		object.put("Zip", zip);
		object.put("Phone Number", phone);
		
		PrintWriter printWriter = null;	
		try {
			printWriter = new PrintWriter("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Address.json");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		printWriter.write(object.toJSONString());
		printWriter.close();
	}
	
	
	void writeBook(JSONObject jsonObject) {
		JSONParser parser = new JSONParser();
		JSONArray bookArray = null;
		File file = new File("/home/bridgeit/Sid/addressbook.txt");
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			bookArray = new JSONArray();
		} else {
			try {
				bookArray = (JSONArray) parser.parse(new FileReader("/home/bridgeit/Sid/addressbook.txt"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			catch(ParseException e) {
				e.printStackTrace();
			}
		}
		bookArray.add(jsonObject);
		printWriter(bookArray);
		System.out.println("Contact added successfully");
	}
	
	void printWriter(JSONArray bookArray) {
		try {
			PrintWriter printWriter = new PrintWriter("/home/bridgeit/Sid/addressbook.txt");
			printWriter.write(bookArray.toJSONString());
			printWriter.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		addDetail();
		

	}

}
