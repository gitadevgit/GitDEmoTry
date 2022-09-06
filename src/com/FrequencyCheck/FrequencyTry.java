package com.FrequencyCheck;
//trying gitbash n git
//frequency of each character from string
import java.util.HashMap;
import java.util.Scanner;

public class FrequencyTry {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Your String :");
//		String name = sc.nextLine();

		HashMap<Character, Integer> hmap1 = new HashMap<Character, Integer>();
//		hmap1.put('c',1);
//		hmap1.put('a',2);
//		hmap1.put('j',3);

		// System.out.println(hmap1.get('a'));

		String name = "sriiyaa";
		// s= 1 r=1 i=2 y=1 a=2

		// creating hashmap count
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
		System.out.println(hmap);
		// sc.close();
	}

}
