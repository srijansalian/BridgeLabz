package com.bridgelabz.OOPS.Controller;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.OOPS.ServiceImp.InventoryManServiceImp;


public class InventoryMan {


		public static long getValue(JSONArray array){
			Iterator<?> iterator = array.iterator();	
			long value = 0;
			while(iterator.hasNext()) {
				JSONObject obj = (JSONObject)iterator.next();
				long weight = (long)obj.get("weight");
				long price = (long)obj.get("price");
				value = value + weight * price;	
			}
			return value;
		}
		
		public static void main(String[] args) {
				InventoryManServiceImp inven = new InventoryManServiceImp();
				inven.writeData();	
				inven.readData();	
				
			}

	}


