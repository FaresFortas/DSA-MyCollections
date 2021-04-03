package com.dsa.search;

public class BinarSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size = 1000000;
		int[] numbers = new int[size];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		}

		int search = 1275;
		int low = 0;
		int high = numbers.length - 1;
		int mid = 0;
		Boolean isFound = false;
		int tries = 0;
		while (!isFound) {
			if (low > high) {
				System.out.println("number is not found.");
				break;
			}
			tries++;
			mid = low + ((high - low) / 2);
			if (numbers[mid] == search) {
				System.out.println("number is found.");
				System.out.println("Number Tries : "+tries+" try.");
				break;
			}
			if (numbers[mid] < search) {
				low = mid + 1;
			}
			if (numbers[mid] > search) {
				high = mid - 1;
			}
		}
	}

}
