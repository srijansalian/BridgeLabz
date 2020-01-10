package com.bridgelabz.datastructure;

//import com.bridgelabz.datastructure.Queue.Node;
import com.bridgelabz.util.util;

public class BankersProblem {

	public static void main(String[] args) 
	{
		Queue<String> sk=new Queue<String>();
		double amt1 = 10000;
		System.out.println("Enter number of user");
		int n = util.inputInteger();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the status of Transation W/D");
			String a = util.inputWord();
			System.out.println();
			switch(a)
			{
			case "W":System.out.println("Enter the name of the user:");
				     String user = util.inputWord();
				     sk.enqueue(user);
				     System.out.println("Enter the Amount to withdraw");
				     double uamt = util.inputDouble();
				     amt1 = amt1 - uamt;
				     System.out.println("The remaining amounts are "+amt1);
				     break;
			
			case "D":System.out.println("Enter the name of the user:");
			         String user2 = util.inputWord();
			         sk.enqueue(user2);
			         System.out.println("Enter the Amount To deposite");
			         double u1amt = util.inputDouble();
			         amt1=amt1+u1amt;
			         System.out.println("The amount of the deposite is "+u1amt);
			         break;
			         
			 default:System.out.println("Invalid Input....!!!!Enter Correctly");
			 
		}
			System.out.println();
			System.out.println(sk);
			
		}
		for(int i=1;i<=n;i++) {
			Queue<String>.Node<String> str=sk.dequeue();
			System.out.println(str+" is deleted");
			
		}
		
	}

}
