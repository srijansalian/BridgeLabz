package com.bridgelabz.OOPS;

public class Test {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpno(21);
		emp.setName("Srijan");
		emp.setSalary(50000);
	String Employee  =	Jsonutil.ConvertJavatoaJson(emp);
	System.out.println(Employee);

	}

}
