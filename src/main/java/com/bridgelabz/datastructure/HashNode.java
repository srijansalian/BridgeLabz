package com.bridgelabz.datastructure;


	public class HashNode<T, S> {
		T key;
		S value;
		HashNode<T, S> next;

		HashNode(T key, S value) {
			this.key = key;
			this.value = value;
		}
	

}
