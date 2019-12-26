package com.bridgelabz.logical;

import com.bridgelabz.util.util;

public class Gambling {
	static void gambling (int stake,int goal,int trail) {
		int bets=0;
		int wins =0;
		
		for(int i=0;i<trail;i++) {
			int cash=stake;
			while(cash>0 && cash<goal) {
				bets++;
			if(Math.random()<0.5) {
				cash++;}
			else
				cash--;
			}
			if(cash==goal) 
				wins++;
		
		}
		System.out.println(wins);
		System.out.println((100*wins)/trail);
		System.out.println(bets/trail);
	}

	public static void main(String[] args) {
		System.out.println("Enter stake , Goal , Trail");
		int stake=util.inputInteger();
		int goal=util.inputInteger();
		int trail=util.inputInteger();
		gambling(stake,goal,trail);
		

	}

}
