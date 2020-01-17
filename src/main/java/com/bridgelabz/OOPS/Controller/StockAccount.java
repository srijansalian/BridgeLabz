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
	/*
	 * Method used to display all the Data from the file.
	 */
	public static <T> void displayReport() throws IOException, org.json.simple.parser.ParseException {
		File file1 = new File("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Stock.json");

		fileReader = new FileReader(file1);
		JSONParser parser = new JSONParser();
		JSONArray userDetails = (JSONArray) parser.parse(fileReader);

		Iterator<T> iterator = userDetails.iterator();
		System.out.println("\n" + "All user Detail Report:");
		while (iterator.hasNext()) {
			JSONObject object = (JSONObject) iterator.next();
			System.out.println(object);
		}
	}
	public static void Display() {
		StockAccountImp SAI = new StockAccountImp();
		System.out.println("************Menu*************");
		System.out.println("1.Add the User into the file");
		System.out.println("2.Buy the Share");
		System.out.println("3.Sell the Share");
		System.out.println("4.Display");
		System.out.println("5.Exit");
		System.out.println(); 
		System.out.println("Enter the Choice");
		int choice =sc.nextInt();
		switch(choice) {
		case 1:
				try {
					SAI.createUser();
					Display();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
				break;
		case 2:try {
					SAI.buyShare();
					Display();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					e.printStackTrace();
				}
		break;
		case 3:try {
					SAI.sellShare();
					Display();
				} catch (Throwable e) {
					e.printStackTrace();
				}
		break;
			case 4:try {
					displayReport();
					Display();
				} catch (IOException e) {
					e.printStackTrace();
				} catch (ParseException e) {
					
					e.printStackTrace();
				}
			break;
		case 5: break;
		
		}
		
	}


	public static void main(String[] args) {
		Display();
	}

}
