package com.bridgelabz.OOPS.Controller;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONObject obj=new JSONObject();
		obj.put("Name", "Srijan");
		obj.put("Location", "India");
		
		//Creating an array
		
		JSONArray list =new JSONArray();
		list.add("JAVA");
		list.add("SQL");
		list.add("J2EE");
		
		obj.put("Course",list);
		
		try (FileWriter file=new FileWriter("MyJSON.json"))
				{
			file.write(obj.toString());
			file.flush();
					
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		System.out.println(obj);
			
		
		
		
		
		

	}

}
