package com.bridgelabz.logical;
import java.util.*;

import com.bridgelabz.util.util;
public class CouponNumber {
	 public static int getCoupon(int n) {
	        return (int) (Math.random() * n);
	    }
	 public static int collect(int n) {
	        boolean[] isCollected = new boolean[n];  
	        int count = 0;                          
	        int distinct=0;    
	        while (distinct < n) {
	            int value = getCoupon(n);           
	            count++;                             
	            if (!isCollected[value]) {           
	                distinct++;
	                isCollected[value] = true;
	            }
	        }
	        return count;
	    }
	        

	 
	public static void main(String[] args) {
		System.out.println("Enter number of times");
		int n=util.inputInteger();
		int count = collect(n);
		System.out.println(count);
		

	}

}
