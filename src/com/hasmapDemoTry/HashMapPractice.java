package com.hasmapDemoTry;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer, String> name = new HashMap<Integer, String>();
		name.put(1001, "sriya");
		name.put(1002, "sriyaas");
		name.put(1003, "sriyaa");
		//duplicate lidaina
		//name.put(1003, "sriyaa");
		//overridding 1003
		//name.put(1003, "sriy");

		System.out.println(name);

		//iteration format for hash map using for each/for advance loop
		for (Map.Entry<Integer, String> s : name.entrySet()) {
			System.out.println(s.getKey() + " " + s.getValue());

		}
	}

}
