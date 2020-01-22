package com.bridgelabz.DesignPattern.Structural.AdapterDesignPatternr;

public class Socket {
	public Volt getVolt() {
		return new Volt(120);
	}

}
