package com.collectionSet;

import java.util.Collections;


import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {

		LinkedHashSet<String> name = new LinkedHashSet<String>();
		name.add("sriya");
		name.add("sriyaa");
		name.add("riya");
		name.add("aadil");

		//Collections.sort(name);
		for (String s : name) {
			System.out.println(s);
		}


	}

}
