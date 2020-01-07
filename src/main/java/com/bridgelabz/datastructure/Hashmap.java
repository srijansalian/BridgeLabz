package com.bridgelabz.datastructure;

import java.util.ArrayList;

	public class Hashmap<K, V> {
		// it contains the chain
		public ArrayList<HashNode<K, V>> arrList;
		// capacity of array list
		public int arrCapacity;
		// size of array list
		public int size;

		public Hashmap() {
			arrList = new ArrayList<>();
			arrCapacity = 10;
			size = 0;

			for (int i = 0; i < arrCapacity; i++) {
				arrList.add(null);
			}
		}

		
		public int size() {
			return size;
		}

		
		public boolean isEmpty() {
			return size == 0;
		}

	
		public int hashFunction(K key) {
			int hashCode = (int) key;
			return hashCode % 11;
		}

		
		public V get(K key) {
			
			int hashIndex = hashFunction(key);
			HashNode<K, V> head = arrList.get(hashIndex);

			
			while (head != null) {
				if (head.key.equals(key))
					return head.value;
				head = head.next;
			}

			
			return null;
		}

		// function for adding key and value
		/**
		 * Purpose: method for adding new key and value into array list
		 * 
		 * @param key   key is input from user
		 * @param value value is input from user
		 */
		public void add(K key, V value) {
			int hashIndex = hashFunction(key);
			// Get head of chain
			HashNode<K, V> head = arrList.get(hashIndex);
			// Check if key is already present
			while (head != null) {
				if (head.key.equals(key)) {
					head.value = value;
					return;
				}
				head = head.next;
			}
			// Insert key in chain
			size++;
			head = arrList.get(hashIndex);
			HashNode<K, V> newNode = new HashNode<K, V>(key, value);
			newNode.next = head;
			arrList.set(hashIndex, newNode);
			// If load factor goes beyond threshold, then
			// double hash table size
			if ((1.0 * size) / arrCapacity >= 0.7) {
				ArrayList<HashNode<K, V>> temp = arrList;
				arrList = new ArrayList<>();
				arrCapacity = 2 * arrCapacity;
				size = 0;
				for (int i = 0; i < arrCapacity; i++)
					arrList.add(null);

				for (HashNode<K, V> headNode : temp) {
					while (headNode != null) {
						add(headNode.key, headNode.value);
						headNode = headNode.next;
					}
				}
			}
		}

		// method for removing node from chain
		/**
		 * Purpose: method for removing the key from array list
		 * 
		 * @param key key is passed from user
		 * @return returns the value of key which is deleted
		 */
		public V remove(K key) {
			// Apply hash function to find index for given key
			int hashIndex = hashFunction(key);

			// Get head of chain
			HashNode<K, V> head = arrList.get(hashIndex);

			// Search for key in its chain
			HashNode<K, V> prev = null;
			while (head != null) {
				// If Key found
				if (head.key.equals(key))
					break;

				// Else keep moving in chain
				prev = head;
				head = head.next;
			}

			// If key was not there
			if (head == null)
				return null;

			// Reduce size
			size--;

			// Remove key
			if (prev != null)
				prev.next = head.next;
			else
				arrList.set(hashIndex, head.next);

			return head.value;
		}

		/**
		 * Purpose: this method will show all the array list which contains the data
		 */
		public void show() {
			// System.out.println(chainArray.get(3));
			for (int i = 0; i < arrList.size(); i++) {
				try {
					if (!(arrList.get(i) == null)) {
						System.out.println("\narray index : " + i);
						HashNode<K, V> head = arrList.get(i);
						while (head != null) {
							System.out.print(head.value + " ");
							head = head.next;
						}

					}
				} catch (Exception e) {
					System.err.println(e);
				}

			}

			// Get head of chain

		}

		/**
		 * Purpose: getting the array list and pass in string to main program
		 * 
		 * @return returns the list in string
		 */
		public String returnListInString() {
			String str = "";
			// System.out.println(chainArray.get(3));
			for (int i = 0; i < arrList.size(); i++) {
				try {
					if (!(arrList.get(i) == null)) {
						str += "\narray index : " + i;
						HashNode<K, V> head = arrList.get(i);
						while (head != null) {
							str += head.value + " ";
							head = head.next;
						}

					}
				} catch (Exception e) {
					System.err.println(e);
				}

			}
			return str;

		}

}
