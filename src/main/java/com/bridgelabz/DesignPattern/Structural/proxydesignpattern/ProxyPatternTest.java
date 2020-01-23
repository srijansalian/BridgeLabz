package com.bridgelabz.DesignPattern.Structural.proxydesignpattern;

public class ProxyPatternTest {

	public static void main(String[] args) {
		ProxyInf executor = new ExecuteProxy("Srijan", "wrong_pwd");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
		
	}
		

	}


