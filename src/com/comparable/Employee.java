package com.comparable;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee emp) {

		if (this.salary > emp.salary) {

			return 1;
		} else if (this.salary < emp.salary) {
			return -1;
		} else {
			return 0;
		}

	}

}
