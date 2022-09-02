package com.hasmapDemoMaxMin;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class haspmaptry {

	// frequency of each character from string --maximum occuring

	public static void main(String[] args) {

		String name = "SSRRIIYAAA";
		name = name.replaceAll("\\s", "");
		name = name.toLowerCase();
		// System.out.println(name);
		// using hashmap to store unique character with integer count
		HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

		for (int i = 0; i < name.length(); i++) {
			if (hmap.containsKey(name.charAt(i))) {

				// System.out.println(name.charAt(i));

				int count = hmap.get(name.charAt(i));// key
				count++;
				// System.out.println(count);// number counting
				hmap.put(name.charAt(i), count);
			} else {
				hmap.put(name.charAt(i), 1);
			}
		}
		// Now To find the highest character repeated
		// int maxcount = 0;
		// char maxchar = ' ';// setting to blank by default
		int minicount =1;
		char minichar = ' ';
		// Entry is subinterface of Map//entryset is method in hashmap
		for (Map.Entry<Character, Integer> a : hmap.entrySet()) {
			System.out.println("Key=" + a.getKey() + ":Value" + a.getValue());
			if (a.getValue() <= minicount) {
				// if (a.getValue() > maxcount) {
				// maxcount = a.getValue();
				minicount = a.getValue();
				// maxchar = a.getKey();
				minichar = a.getKey();
			//	System.out.println(minichar);
			}
		}
		// System.out.println("maximum Occuring character" + " " + maxcount + " " +
		// maxchar);
		System.out.println("minimum Occuring character" + "  " + minicount + "  " +minichar);

	}

}
