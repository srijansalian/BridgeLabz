package com.bridgelabz.datastructure;

import java.io.IOException;
import java.util.Scanner;
//import com.bridgelabz.util;
import com.bridgelabz.util.DataStructureUtility;

public class SilnglyLinkedListRunner {
	

	
	public static void main(String[] args) {
		DataStructureUtility<String> lst = new DataStructureUtility<String>();
		String[] strArray = null;
		strArray = lst.getFileText("C:\\Users\\Srijan Salian\\Desktop\\1.txt").split(",");
		int size = strArray.length;
		for(int i=0;i<strArray.length;i++)
			lst.add(strArray[i]);
		System.out.println(lst);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key to search");
		String key = scanner.next();
		
		lst.show();

	}

}
