package com.bridgelabz.Algorithm;
import com.bridgelabz.util.util;
public class BinarySearch {
	
	public static void main(String[] args)throws java.io.IOException {
		String str=util.getFromFile("C:\\Users\\Srijan Salian\\Desktop\\1.txt");
		String[] strArr = str.split(",");
		
		util.strInsertionSort(strArr);
		util.printArraystring(strArr);
		String key=util.inputWord();
		int index=util.strBinarySearch(strArr, key);
		if(index>=0)
			System.out.println("Key is Found");
		else
			if(index==-1)
			System.out.println("Key is not found");
	}

}

