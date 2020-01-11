package com.bridgelabz.OOPS.Controller;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.OOPS.ServiceImp.InventoryServiceImp;
public class Inventoryy {
	
	public static long getValue(JSONArray array){
		Iterator<?> iterator = array.iterator();	//	iterator to iterate
		long value = 0;	//	inventory value
		while(iterator.hasNext()) {
			JSONObject obj = (JSONObject)iterator.next();
			long weight = (long)obj.get("weight");
			long price = (long)obj.get("price");
			value = value + weight * price;	//	adding value
		}
		return value;
	}
	
	public static void main(String[] args) {

				//	class object
			InventoryServiceImp inven = new InventoryServiceImp();
			inven.writeData();	
			inven.readData();	
			
		}
		
		
		

		
		
		
	

}
