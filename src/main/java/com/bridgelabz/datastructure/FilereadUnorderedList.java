package com.bridgelabz.datastructure;
import java.io.*;
import java.util.Scanner;
                                

public class FilereadUnorderedList<T> {

	public static void main(String[] args) {
		try {
			
		File f1 = new File("C:\\Users\\Srijan Salian\\Desktop\\1.txt");
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		
			Scanner sf = new Scanner(f1);
			Scanner s = new Scanner(System.in);
			while (sf.hasNext()) {
				list.add(sf.next());
			}
			// printing list
			System.out.println(list);
			System.out.println();
			FileWriter fw = new FileWriter(f1);
			System.out.println("Enter a word ");
			String s1 = s.nextLine();
			System.out.println(list.size());
			
			if (list.search(s1)) {
				list.remove(s1);
				int n = 0;
				while (n < list.size()) {
					fw.write(list.pop() + " ");
					fw.flush();
					n++;
				}
				System.out.println("found and deleted");
				
			} else {
				list.add(s1);
				int n = 0;
				while (n < list.size()) {
					fw.write(list.pop() + " ");
					fw.flush();
					n++;
				}
				System.out.println("added and saved");
				fw.close();
				s.close();
				sf.close();
			}

		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		} catch (IOException e) {
			System.out.println("io excep");
		}
	}
		
}


