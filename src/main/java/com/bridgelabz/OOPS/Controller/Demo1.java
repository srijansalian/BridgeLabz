package com.bridgelabz.OOPS.Controller;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JSONParser parser= new JSONParser();
		try
		{
			Object obj=parser.parse(new FileReader("MyJSON.json"));
			JSONObject jsonobject=(JSONObject)obj;
			
			
			//creating a object of json array
			
			JSONArray countarray=(JSONArray)jsonobject.get("Course");
			Iterator<String> iterator=countarray.iterator();
			while(iterator.hasNext())
			{
				System.out.println("Course : "+iterator.next());
				
			}
			
			
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();}
		
		catch(IOException e) {e.printStackTrace();}
		//catch(FileNotFoundException e) {e.printStackTrace();}
		//catch(parse e) {e.printStackTrace();}
		//catch(IOException e) {e.printStackTrace();}
 catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

}


