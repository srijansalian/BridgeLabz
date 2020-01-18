package com.bridgelabz.OOPS.ServiceImp;

/*
 * Implementation for the Deck of card problems 
 */
import java.util.Random;
import com.bridgelabz.OOPS.Service.DeckOfCardInf;
public class DeckofCardImp implements DeckOfCardInf {
	static String[] suits = {"Heart   ","Diamond ","Shades ","Clubs   "};
	static String[] ranks = {" 1","  2"," 3"," 4"," 5"," 6"," 7"," 8"," 9"," 10"," Jack"," Queen"," King"," Ace"};
	static String[] card = new String[56]; 
	static int i=0;

	/*
	 * Method for the get the card
	 * Returns suits and the ranks
	 */
	@Override
	public String[] getCard() {
		for(String suit:suits) 
		{
			for(String rank : ranks) 
			{
				card[i++] = suit+rank;
			}
		}return card;
		
	}

	/*
	 * Method for the shuffling of the card
	 * Returns null
	 */
	@Override
	public void suffle() {
		Random rd = new Random();
		for(int i=0;i<card.length;i++) 
		{
			int index = rd.nextInt(52); //Gets the random value up to 52
			String temp = card[index];
			card[index] = card[i];
			card[i] = temp;	
		}	
		
	}
	/*
	 * Method used for the distribute the card into n number of the player
	 * Returns array
	 */
	@Override
	public String[][] distribute(int numberofplayer,int numberofcards) {
		String array[][] = new String[numberofplayer][numberofcards]; 
		for(int i=0,k=0;i<numberofplayer;i++) 
		{
			for(int j=0;j<numberofcards;j++) 
			{
				array[i][j] = card[k++];
			}
			
		}return array;
	}

	/*
	 * Method for the Display the array
	 * 
	 */
	@Override
	public void display(String[][] array) {

		for(int i=0;i<array.length;i++) 
		{
			for(int j=0;j<array[i].length;j++) 
			{
				if(i==0)
				System.out.println("Player 1 : "+array[i][j]);
				else
					if(i==1) 
						System.out.println("Player 2 : "+array[i][j]);
					else
						if(i==2)
							System.out.println("Player 3 : "+array[i][j]);
						else
							System.out.println("Player 4 : "+array[i][j]);		
			}
			System.out.println();
				
		}
		
	}

}
