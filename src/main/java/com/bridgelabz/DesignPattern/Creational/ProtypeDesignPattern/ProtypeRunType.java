package com.bridgelabz.DesignPattern.Creational.ProtypeDesignPattern;

import java.util.List;

public class ProtypeRunType {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp = new Employee();
		emp.Load();
		
		Employee empsNew = (Employee) emp.clone();
		Employee empsNew1 = (Employee) emp.clone();
		
		List<String> list = empsNew.getList();
		list.add("Deepak");
		List<String> list1 = empsNew1.getList();
		list1.remove("Nayan");
		
		System.out.println("Emp list :"+ emp.getList());
		System.out.println("Emp of list 1 :"+list);
		System.out.println("Emp of list 2:" +list1);

	}

}
