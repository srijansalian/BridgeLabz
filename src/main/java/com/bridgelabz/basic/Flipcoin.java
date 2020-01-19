package com.bridgelabz.basic;
import com.bridgelabz.util.util;

public class Flipcoin {
	static void flip(int n) {
		@SuppressWarnings("unused")
		int head=0,tail=0;
		for(int i=1;i<=n;i++) {
			double z=Math.random();
			
			if(z<0.5) 
				head++;
				else
					tail++;
		}
		int a=(tail*100)/n;
		int b=100-a;
		System.out.println("Tail is "+a);
		System.out.println("Head is "+b);

		
	}

	public static void main(String[] args) {
		System.out.println("Enter Number of tines the coin must be Fliped");
		int n=util.inputInteger();
		flip(n);
		
		
	}

}
