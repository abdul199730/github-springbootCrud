package com.occurence;

import java.util.HashMap;
import java.util.Map;

public class Frequency {
	// this method is used for finding the integer count
	public static void frequencyCount(int arr[], int num) {
		HashMap<Integer, Integer> count = new HashMap<>();
		for (int i = 0; i < num; i++) {
			if (count.containsKey(arr[i])) {
				count.put(arr[i], count.get(arr[i]) + 1);
			} else {
				count.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entryset : count.entrySet()) {
			System.out.println(entryset.getKey() + " " + entryset.getValue());
		}
		System.out.println("after breakig for loop"+count);

	}

	// this method is used for converting string character
	public static void countCharater(String str, char[] convert) {
		convert = str.toCharArray();
		HashMap<Character, Integer> charaterCount = new HashMap<>();
		for (char ch : convert) {
			if (charaterCount.containsKey(ch)) {
				charaterCount.put(ch, charaterCount.get(ch) + 1);
			} else {
				charaterCount.put(ch, 1);
			}
		}
		//this is iterating for hasmap object
		for (Map.Entry<Character, Integer> entryset : charaterCount.entrySet()) {
			System.out.println(entryset.getKey() + " " + entryset.getValue());
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 10, 20, 20, 30, 40, 50 };
		int n = arr1.length;

	    frequencyCount(arr1, n);
       // System.out.println("after frequency check::"+frequencyCount(arr1, n));

        String str1 = "javaexample";
		char[] char1 = str1.toCharArray();
		countCharater(str1, char1);
	}

}
