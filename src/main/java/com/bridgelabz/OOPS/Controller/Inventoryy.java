package com.bridgelabz.OOPS.Controller;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.bridgelabz.OOPS.Model.InventoryModel;
import com.bridgelabz.OOPS.ServiceImp.InventoryServiceImp;
public class Inventoryy {
	
	public static long getValue(JSONArray array){
		InventoryModel InModel = new InventoryModel();
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
			InventoryServiceImp inven = new InventoryServiceImp();
			inven.writeData();	
			inven.readData();	
			
		}
		
		
		

		
		
		
	

}
