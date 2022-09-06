package com.collectionSet;

import java.util.ArrayList;
import java.util.Collections;

public class ArraylistDemo {
	public static void main(String[] args) {

		ArrayList<String> name2 = new ArrayList<String>();
		name2.add("zorba");
		name2.add("tupple");
		name2.add("adidas");

		Collections.sort(name2);
		for (String s : name2) {
			System.out.println(s);
		}

	}

}
