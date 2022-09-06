package com.collectionList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class ArraylistToHashNtreeSetDemo {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();

		name.add("Nepal");
		name.add("sunita");
		name.add("namrata");
		name.add("sara");
		name.add("anusha");
		name.remove(0);

//		for (String value : name) {
//			if (!value.equals("Nepal")) {
//				System.out.println(value);
//			} else {
//				continue;
//			}

		// HashSet<String> name2 = new HashSet<String>(name);
		TreeSet<String> name2 = new TreeSet<String>();// sorted order
		name2.addAll(name);
		System.out.println(name2);
		}

	}

