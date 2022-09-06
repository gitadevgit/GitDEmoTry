package com.comparator;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

	@Override
	public int compare(Student std1, Student std2) {
		if (std1.age > std2.age) {
			return 1;
		} else if (std1.age < std2.age) {
			return -1;
		} else {
			return 0;
		}

	}
}