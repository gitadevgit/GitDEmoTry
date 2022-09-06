package com.hasmapStudentObject;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<Integer, Student> name = new HashMap<Integer, Student>();
		Student st = new Student(101, "sriya", "texas");
		Student st2 = new Student(102, "erlene", "kathmandu");
		Student st3 = new Student(103, "bikash", "nepal");

		name.put(1, st);
		name.put(2, st2);
		name.put(3, st3);

		for (Map.Entry<Integer, Student> n : name.entrySet()) {
			Student st4 = n.getValue();
			System.out.println(st4.getId() + " " + st4.getName() + " " + st4.getAddress());

		}

	}

}
