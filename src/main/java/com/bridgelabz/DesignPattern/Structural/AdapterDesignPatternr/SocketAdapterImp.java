package com.bridgelabz.DesignPattern.Structural.AdapterDesignPatternr;

public class SocketAdapterImp extends Socket implements SocketAdapter {
	private Socket sock = new Socket();
	@Override
	public Volt get120volt() {
		return getVolt();
	}

	@Override
	public Volt get12volt() {
		Volt v = sock.getVolt();
		return convertVolt(v,10);
	}

	@Override
	public Volt get3volt() {
		Volt v = sock.getVolt();
		return convertVolt(v,40);
	}
	
	private Volt convertVolt(Volt v,int i) {
		return new Volt(v.getVolt()/i);
	}
	

}
