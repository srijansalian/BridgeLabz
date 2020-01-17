package com.bridgelabz.OOPS.ServiceImp;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.OOPS.Service.AddressBookInf;

public class AddressBookImp implements AddressBookInf {
	private static File file;
	private static FileWriter fileWriter;
	private static FileReader fileReader;
	static Scanner sc = new Scanner(System.in);


	@SuppressWarnings("unchecked")
	@Override
	public void addNewPerson() {
		try {
			file = new File("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Address.json");
			if (file.exists()) {

				if (file.canRead() && file.canWrite()) {
					fileReader = new FileReader(file);
					JSONParser parser = new JSONParser();
					JSONArray array =(JSONArray) parser.parse(fileReader);
					JSONObject json = new JSONObject();
					System.out.println("Enter First Name:");
					String firstname =  sc.next();
					System.out.println("Enter Last Name:");
					String lastname =  sc.next();
					System.out.println("Enter Address:");
					String address =  sc.next();
					System.out.println("Enter City:");
					String city = sc.next();
					System.out.println("Enter State:");
					String state =  sc.next();
					System.out.println("Enter ZIP Code:");
					String zip =  sc.next();
					System.out.println("Enter Mobile Number:");
					String mobile =  sc.next();
					json.put("Firstname", firstname);
					json.put("Lastname", lastname);
					json.put("Address", address);
					json.put("City", city);
					json.put("State", state);
					json.put("Zip", zip);
					json.put("Mobile", mobile);
					array.add(json);
					System.out.println("Your details added Successfully." + "\n");
					fileWriter = new FileWriter(file);
					fileWriter.write(JSONArray.toJSONString(array));
					fileWriter.flush();
					fileWriter.close();
				}
			} else {
				System.out.println("File not exits..");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void editInformation() {
		{
			try {
				file = new File("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Address.json");
				if (file.exists()) {
					if (file.canRead() && file.canWrite()) {
						fileReader = new FileReader(file);
						JSONParser parser = new JSONParser();
						JSONArray array = (JSONArray) parser.parse(fileReader);
						Iterator<?> iterator = array.iterator();
						System.out.println("Enter the Name of person you want to edit details:");
						String name = sc.next();
						boolean check = false;
						while (iterator.hasNext()) {
							JSONObject object = (JSONObject) iterator.next();
							if (object.get("Firstname").equals(name)) {
								System.out.println("What you want to edit in Address Book......?");
								System.out.println("LastName");
								System.out.println("Address");
								System.out.println("City");
								System.out.println("State");
								System.out.println("Zip");
								String edit = sc.next();
								System.out.println("Enter the" + edit + " to update.");
								String update = sc.next();
								object.remove(edit);
								object.put(edit, update);
								System.out.println("Information Saved Successfully.");
								check = true;
								break;
							}
						}
						if (check == false) {
							System.out.println("The Entered User is Not Found" + "\n");
						}
						fileWriter = new FileWriter(file);
						fileWriter.write(JSONArray.toJSONString(array));
						fileWriter.flush();
						fileWriter.close();
					} 
				} else {
					System.out.println("File not exist..");
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void deletePerson() {
		{
			try {
				file = new File("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Address.json");
				if (file.exists()) {
					if (file.canRead()) {
						fileReader = new FileReader(file);
						JSONParser parser = new JSONParser();
						JSONArray array = (JSONArray) parser.parse(fileReader);

						System.out.println("Enter The FristName That must br Deleted");
						String name = sc.next();

						Iterator<?> iterator = array.iterator();
						boolean check = false;
						while (iterator.hasNext()) {
							JSONObject jsonObject = (JSONObject) iterator.next();

							if (jsonObject.get("Firstname").equals(name)) {
								array.remove(jsonObject);
								System.out.println("Deleted Successfully." + "\n");
								check = true;
								break;
							}
						}
						if (check == false) {
							System.out.println("Person do not exist in Address Book." + "\n");
						}
						if (file.canWrite()) {
							fileWriter = new FileWriter(file);
							fileWriter.write(JSONArray.toJSONString(array));
							fileWriter.flush();
							fileWriter.close();
						} 
					}
				} else {
					System.out.println("File not exits..");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void printAddressBook() {
		{
			try {
				file = new File("/home/user/eclipse-workspace/Bridgelbz/src/main/java/com/bridgelabz/OOPS/Repo/Address.json");
				if (file.exists()) {
					if (file.canRead() && file.canWrite()) {
						fileReader = new FileReader(file);
						JSONParser parser = new JSONParser();
						JSONArray array = (JSONArray) parser.parse(fileReader);
						@SuppressWarnings("rawtypes")
						Iterator iterator = array.iterator();
						System.out.println( "================Address Book===============");

						while (iterator.hasNext()) {
							JSONObject obj = (JSONObject) iterator.next();
							System.out.println("==============Person Details============");
							System.out.println("First Name : " + obj.get("Firstname"));
							System.out.println("Last Name  : " + obj.get("Lastname"));
							System.out.println("Address    : " + obj.get("Address"));
							System.out.println("City       : " + obj.get("City"));
							System.out.println("State      : " + obj.get("State"));
							System.out.println("Zip        : " + obj.get("Zip"));
							System.out.println("Mobile     : " + obj.get("Mobile"));
						}
					} 
				} else {
					System.out.println("Filenot exist.." + "\n");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		
	}

}
