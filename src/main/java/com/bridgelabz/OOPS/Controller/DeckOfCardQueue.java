package com.bridgelabz.OOPS.Controller;

import com.bridgelabz.datastructure.Queue;

public class DeckOfCardQueue {
	static String[] suits = {"Hearts","Shades","Diamond","Clubs"};
	static String[] ranks = {"1","2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
	public static void deckOfCards(String[] suits, String[] ranks) {
		String array[][] = new String[4][9];

		// initialize deck
		int numberOfCards = suits.length * ranks.length;
		String[] deck = new String[numberOfCards];

		// initialize deck
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + "->" + suits[j];
				
			}
		}

		// shuffle cards
		for (int i = 0; i < numberOfCards; i++) {
			int random = i + (int) (Math.random() * (numberOfCards - i));
			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
		}

		// distribute 9 cards to 4 player
		for (int i = 0; i < 4; i++) {
			System.out.print("Player" + (i + 1) + "\n");
			for (int j = 0; j < 9; j++) {
				array[i][j] = (deck[i + j * 4]);
				System.out.print(" " + array[i][j]);
			}
			System.out.println("\n");
		}
	}

	/**
	 * This method is to print deck of card using queue
	 * 
	 * @param suits
	 * @param ranks
	 */
	public static void deckOfCardsQueue(String[] suits, String[] ranks) {

		String array[][] = new String[4][9];

		// initialize deck
		int numberOfCards = suits.length * ranks.length;
		String[] deck = new String[numberOfCards];

		// initialize deck
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + "->" + suits[j];
				
			}
		}

		// shuffle cards
		for (int i = 0; i < numberOfCards; i++) {
			int random = i + (int) (Math.random() * (numberOfCards - i));
			String temp = deck[random];
			deck[random] = deck[i];
			deck[i] = temp;
		}

		Queue queueDeck = new Queue();
		// distribute 9 cards to 4 player
		for (int i = 0; i < 4; i++) {
			System.out.print("Player" + (i + 1) + "\n");
			for (int j = 0; j < 9; j++) {
				array[i][j] = (deck[i + j * 4]);
				
				queueDeck.enqueue(array[i][j]);
				
			}
			System.out.println(queueDeck);
			System.out.println("\n");
		}
	}

	public static void main(String[] args) {
		deckOfCardsQueue(suits,ranks);
		
		

	}

}
