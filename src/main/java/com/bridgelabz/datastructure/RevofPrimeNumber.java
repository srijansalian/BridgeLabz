package com.bridgelabz.datastructure;

import java.util.ArrayList;

//import com.bridgelabz.datastructure.Stack.Node;
import com.bridgelabz.util.DataStructureUtility;

public class RevofPrimeNumber 
{	
public static void main(String[] args) {
	Stack stk=new Stack();
	ArrayList<Integer> al=new ArrayList<Integer>();
	ArrayList<Integer> al1=new ArrayList<Integer>();
	al=DataStructureUtility.prime();
	
	al1=DataStructureUtility.angara(al);
	//System.out.println(al1);
	//a=DataStructureUtility.primeDisplay(al1);
	//DataStructureUtility.print2darray(a);
	for(int i=0;i<al1.size();i++) {
		stk.push(al1.get(i));
	}
	System.out.println(stk);
	stk.reverse();
	System.out.println(stk);
	
	
	
	
}
}

