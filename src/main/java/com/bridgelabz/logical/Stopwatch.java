package com.bridgelabz.logical;
import java.util.Scanner;
import com.bridgelabz.util.util;

public class Stopwatch {
	 private final long start;
	private long starttime=0;
	private long endtime=0;
	private boolean running=false;
	
	public void start() {
		this.starttime=System.currentTimeMillis();
		this.running=true;
		
	}
	public  void stop() {
		this.endtime=System.currentTimeMillis();
		this.running=false;
	}
	 public Stopwatch() {
	        start = System.currentTimeMillis();
	    } 
	 public double elapsedTime() {
	        long now = System.currentTimeMillis();
	        return (now - start) / 1000.0;
	    }
	public   void gettimeinsec() {
		long e;
		
		if(running)
			e=((System.currentTimeMillis()-starttime)/1000);
		else
			e=((endtime-starttime)/1000);
		System.out.println(e);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stopwatch s=new Stopwatch();
		Scanner sc=new Scanner(System.in);
		char y;
		System.out.println("Enter the Y key to start the watch and s to stop the time");
		char y1=sc.next().charAt(0);
		if(y1=='y'||y1=='Y') {
			double a=System.currentTimeMillis();
		}
		if(y1=='s') {
			double b=System.currentTimeMillis();
		}
		
		
		s.gettimeinsec();
		

	}

}
