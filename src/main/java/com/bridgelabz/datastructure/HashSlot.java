package com.bridgelabz.datastructure;
import java.io.IOException;
import java.util.Arrays;

import java.util.Scanner;

import com.bridgelabz.util.DataStructureUtility;



public class HashSlot {
static int[] arr;

	public static void main(String[] args) {
		
		Hashmap<Integer, Integer> hashmap = new Hashmap<Integer, Integer>();
		String readMessage = "";
		try {
			readMessage = DataStructureUtility.readFile("C:\\Users\\Srijan Salian\\Desktop\\2.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] str = readMessage.split(" ");
		arr = new int[str.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Keys Are");
		for (int i = 0; i < arr.length; i++) {
			hashmap.add(arr[i], arr[i]);
		}
		hashmap.show();
		System.out.println("\nEnter key to search: ");
		Scanner scanner = new Scanner(System.in);
		int key = scanner.nextInt();
		if (hashmap.get(key) != null) {
			hashmap.remove(key);
		} else {
			hashmap.add(key, key);
		}
		scanner.close();
		hashmap.show();
		try {
			DataStructureUtility.writeFile("C:\\\\Users\\\\Srijan Salian\\\\Desktop\\\\2.txt",hashmap.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

