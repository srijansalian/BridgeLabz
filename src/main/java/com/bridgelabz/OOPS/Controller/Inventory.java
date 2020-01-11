package com.bridgelabz.OOPS.Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Inventory {
	 private static void parseEmployeeObject(JSONObject employee) 
	    {
	        //Get employee object within list
	        JSONObject employeeObject = (JSONObject) employee.get("inventory");
	         
	        //Get employee first name
	        String Name = (String) employeeObject.get("name");    
	        System.out.println(Name);
	         
	        //Get employee last name
	        String  weight = (String) employeeObject.get("weight");  
	        System.out.println(weight);
	         
	        //Get employee website name
	        String price = (String) employeeObject.get("price_per_kg");    
	        System.out.println(price);
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader("Inventory.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray inventory = (JSONArray) obj;
            System.out.println(inventory);
             
            //Iterate over employee array
            inventory.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
		catch(ParseException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

