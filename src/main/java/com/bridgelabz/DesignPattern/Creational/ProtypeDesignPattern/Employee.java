package com.bridgelabz.DesignPattern.Creational.ProtypeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	private List<String> emplist;
	
	private Employee(List<String> temp) {
		emplist = new ArrayList<String>();
		
	}
	public void Load() {
		emplist.add("Srijan");
		emplist.add("Brijesh");
		emplist.add("Nayan");
		emplist.add("Pradeep");
		emplist.add("Mahesh");
	}
	public List<String> getList(){
		return emplist;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for(String a : this.getList()) {
			temp.add(a);
		}
		return new Employee(temp);
	}
	

}
