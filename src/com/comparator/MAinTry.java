package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class MAinTry {
	public static void main(String[] args) {

		ArrayList<Student> st = new ArrayList<Student>();
		// st.add(new Student(0, null, 0) )
		st.add(new Student(1, "sriya", 28));
		st.add(new Student(1, "sriyansh", 39));
		st.add(new Student(1, "riya", 27));
		
		//Collections.sort(st, new StudentNameComparator());
		Collections.sort(st, new StudentAgeComparator());

		for (Student s : st) {
			System.out.println(s.age);
		}

	}
}
