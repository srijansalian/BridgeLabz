package com.bridgelabz.OOPS.Controller;
import com.bridgelabz.OOPS.ServiceImp.DeckofCardImp;

public class DeckOfCard {
	public static void main(String[] args) {
		DeckofCardImp Deck = new DeckofCardImp();
		 Deck.getCard();
		 Deck.suffle();
		 String array[][]=Deck.distribute(4, 9);
		 Deck.display(array);
	}

}
