package com.collectionSet;

import java.util.HashSet;

public class HashSetTry {
	public static void main(String[] args) {

		HashSet<String> name = new HashSet<String>();
		name.add("sriya");
		name.add("sriyaa");
		name.add("riya");
		name.add("aadil");

		// System.out.println(name);

		for (String s : name) {
			System.out.println(s);
		}

	}

}
