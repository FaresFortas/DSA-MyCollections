package com.data_structure;

public class MainHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTable<String> hashTable = new HashTable<String>(10);
		hashTable.put(10, "Fares");
		hashTable.put(17, "Ali");
		hashTable.put(12, "Houssein");
		hashTable.put(21, "Antar");
		System.out.println("Value 17 is : "+hashTable.get(17));
	}

}
