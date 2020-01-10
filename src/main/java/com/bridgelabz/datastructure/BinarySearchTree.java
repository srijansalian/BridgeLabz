package com.bridgelabz.datastructure;
import com.bridgelabz.util.util;

public class BinarySearchTree {
	public static int binarycount(int n) {
		if(n==0||n==1)
			return 1;
		else
		{
			int left=0,right=0,sum=0;
			for(int k=1;k<=n;k++) {
				left=binarycount(k-1);
				right=binarycount(n-k);
				sum+=left*right;
			}
			return sum;
		}
		
	}

	public static void main(String[] args) {
		System.out.println("Enter the values from 0 to 1000");
		int n=util.inputInteger();
		int a=binarycount(n);
			System.out.println(a);
	}

}
