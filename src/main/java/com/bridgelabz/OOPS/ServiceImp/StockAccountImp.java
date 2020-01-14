package com.bridgelabz.OOPS.ServiceImp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class StockAccountImp {
	void addorRemoveStock() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1. To Add into the Stock \n  Enter 2. Remove the Stock");
		int choice = sc.nextInt();
		if(choice==1) {
			System.out.println("Enter the Name , Price and the Share of the comapany :");
			String name = sc.next();
			long price = sc.nextLong();
			long share = sc.nextLong();
			
		}
		else
			if(choice==2) {
				System.out.println("Enter the Name , Price and the Share of the comapany :");
				String name = sc.next();
				long price = sc.nextLong();
				long share = sc.nextLong();
			}
	}
	
	public static void buy(String name, long price , long share) {
		String dateTime = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
		System.out.println(dateTime);
		
	}

}
