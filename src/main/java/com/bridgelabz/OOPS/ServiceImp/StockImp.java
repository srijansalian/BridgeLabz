package com.bridgelabz.OOPS.ServiceImp;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.OOPS.Controller.Stock;
import com.bridgelabz.OOPS.Service.StockInf;
public class StockImp implements StockInf {
	@SuppressWarnings("unchecked")
	@Override
	/*
	 * Method used to write into an JSONObject
	 */
	public void writeData() {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter the number of Stocks");
		int n = scanner.nextInt();
		JSONArray array = new JSONArray();
		for(int i=1;i<=n;i++) {
			JSONObject object=new JSONObject();
			System.out.println("Enter the Name ,Share ,Price ");
			object.put("name", scanner.next());
			object.put("share", scanner.nextInt());//Used to take the input from user
			object.put("price", scanner.nextInt());
			System.out.println("=============================================================");
			array.add(object); //Adding the JSONObject into JSONArray
			}
		scanner.close();
		PrintWriter printWriter = null;	//	to write data to the file
		try {
			printWriter = new PrintWriter("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Stock.json");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		printWriter.write(array.toJSONString());
		printWriter.close();
		
		
	}
	/*
	 * Method to read the Object from the JSON file
	 * Calculate the Total Stock
	 */
	public void readData() {
		JSONArray array = new JSONArray();
		JSONParser parser = new JSONParser();
		 try
		 {
				array = (JSONArray) parser.parse(new FileReader("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Stock.json"));
				long a = Stock.getvalue(array);
				
				System.out.println("Grand Total Stock Price : "+a);
				
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
