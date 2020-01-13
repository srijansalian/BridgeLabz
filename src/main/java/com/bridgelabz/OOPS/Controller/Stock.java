package com.bridgelabz.OOPS.Controller;
import java.util.Iterator;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import com.bridgelabz.OOPS.Model.StockModel;
import com.bridgelabz.OOPS.ServiceImp.StockImp;
public class Stock {
	/**
	 * Method to Calculate the Total value
	 * @param array
	 * @return Total 
	 */
	public static long getvalue(JSONArray array) {
		@SuppressWarnings("unchecked")
		Iterator<Object> iterator = array.iterator();
		StockModel SM = new StockModel();
		long total=0;
		long grand=0;
		while(iterator.hasNext())
		{
			JSONObject obj = (JSONObject)iterator.next();
			String name = (String)obj.get("name");
			SM.setName(name);
			long price = (long) obj.get("price");
			SM.setPrice(price);
			long share = (long) obj.get("share");
			SM.setShare(share);
			System.out.println("Stock Name : "+SM.getName());
			System.out.println("Price of the Stock : "+SM.getPrice());
			System.out.println("Share of an Stock : " +SM.getShare());
			System.out.println("====================================================");
			total=price*share;
			SM.setTotal(total);
			System.out.println("Total Stock Price : "+SM.getTotal());
			System.out.println("====================================================");
			grand = grand+ total;
			SM.setGrand(grand);
		}
		return SM.getGrand();
	}
	/*
	 * Main Method
	 */

	public static void main(String[] args) {
		StockImp SI = new StockImp();
		SI.writeData();
		SI.readData();
		

	}

}
