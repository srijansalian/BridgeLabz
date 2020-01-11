package com.bridgelabz.OOPS.Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Inventory {
	 private static void parseEmployeeObject(JSONObject employee) 
	    {
	        
	        JSONObject employeeObject = (JSONObject) employee.get("inventory");
	         
	      
	        String Name =  (String) employeeObject.get("name");    
	        System.out.println(Name);
	         
	     
	        int  weight =  (int) employeeObject.get("weight");  
	        System.out.println(weight);
	         
	        
	        int price =  (int) employeeObject.get("price_per_kg");    
	        System.out.println(price);
	        
	       // System.out.println("THE SUM IS");
	       // int a=weight*price;
	       // System.out.println(Name+" The value is "+a);
	        
	        
	    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser jsonParser = new JSONParser();
		try (FileReader reader = new FileReader("Inventory.json"))
        {
            //Read JSON file
            Object obj;
			
				obj = jsonParser.parse(reader);
				JSONObject ob = (JSONObject) obj;
				JSONArray inventory = (JSONArray) ob.get("inventory");
	            System.out.println(inventory);
	           // Iterator<String> iterator=inventory.iterator();
				//while(iterator.hasNext())
				//{//
					//System.out.println("Course : "+iterator.next());
					
			//	}
	            //Iterate over employee array
	            inventory.forEach( emp -> parseEmployeeObject( (JSONObject) emp ));
			 
			
 
             
            	
            
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();}
            
         catch (IOException e) {
            e.printStackTrace();
        }
			//catch (ParseException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
		//	}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}



