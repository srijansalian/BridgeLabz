package com.bridgelabz.DesignPattern.Structural.proxydesignpattern;

public class ProxyImp implements ProxyInf {

	@Override
	public void runCommand(String cmd) throws Exception {
		
		Runtime.getRuntime().exec(cmd);
		System.out.println("'" + cmd + "' command line executed");
		
	}

}
