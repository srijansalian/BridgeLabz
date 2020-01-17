package com.bridgelabz.OOPS.Controller;
import com.bridgelabz.OOPS.ServiceImp.AddressBookImp;
import com.bridgelabz.util.util;

public class AddessBook {
/*
 * Method that is displays the menu for the user 
 */
	static void askPerson() {
		AddressBookImp address = new  AddressBookImp();
		System.out.println("************MENU*************");
		System.out.println("1.To Add the Person Address");
		System.out.println("2.To Edit the Present Address ");
		System.out.println("3.To Remove an Complete Detail");
		System.out.println("4.To Display the given address");
		System.out.println("5.Exit");
		int choice = util.inputInteger();
		
		switch(choice) {
		case 1 : address.addNewPerson();
				 askPerson();
				 break;
		case 2 : address.editInformation();
				 askPerson();
				 break;
		case 3: address.deletePerson();
				askPerson();
				break;
		case 4: address.printAddressBook();
				askPerson();
				break;
		case 5: break;
		}
		
	}
/*
 * Main class of an Address Book
 */
	public static void main(String[] args) {
		askPerson();
		
	}

}
