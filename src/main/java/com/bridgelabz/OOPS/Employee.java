package com.bridgelabz.OOPS;

import java.io.Serializable;

public class Employee implements Serializable {
	private int Empno;
	private String Name;
	public int getEmpno() {
		return Empno;
	}
	public void setEmpno(int empno) {
		Empno = empno;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	private double Salary;

}
