package com.collectionSet;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {

		// sorted oder maa dinxa

		TreeSet<String> name2 = new TreeSet<String>();
		name2.add("zorba");
		name2.add("tupple");
		name2.add("adidas");

		for (String s : name2) {
			System.out.println(s);
		}

	}

}
