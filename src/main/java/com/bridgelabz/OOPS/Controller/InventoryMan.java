package com.bridgelabz.OOPS.Controller;

import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.OOPS.Model.InventoryManModel;

import com.bridgelabz.OOPS.ServiceImp.InventoryManServiceImp;


public class InventoryMan {


		public static long getValue(JSONArray array){
			InventoryManModel InModel = new InventoryManModel();
			Iterator<?> iterator = array.iterator();	
			long value = 0;
			while(iterator.hasNext()) {
				JSONObject obj = (JSONObject)iterator.next();
				long weight = (long)obj.get("weight");
				InModel.setWeight(weight);
				System.out.println("Weight : "+InModel.getWeight());
				long price = (long)obj.get("price");
				InModel.setPrice(price);
				System.out.println("Price : "+InModel.getPrice());
				value = value + weight * price;	
				InModel.setValue(value);
			}
			 return InModel.getValue();
		}
		
		public static void main(String[] args) {
				InventoryManServiceImp inven = new InventoryManServiceImp();
				inven.writeData();	
				inven.readData();	
				
			}

	}


