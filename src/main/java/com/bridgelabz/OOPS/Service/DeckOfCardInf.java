package com.bridgelabz.OOPS.Service;
/*
 * Interface for the Deck of card
 */
public interface DeckOfCardInf {
	public String[] getCard();
	void suffle();
	//public String[][] distribute();
	public void display(String array[][]);
	public String[][] distribute(int numberofplayer, int numberofcards);
	

}
