package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class mainComparable {
	public static void main(String[] args) {
		// TODO Auto-generated constructor stub

		ArrayList<Employee> emp = new ArrayList<Employee>();
		// anonymous
		//salary ko base maa compare gardaexa
		emp.add(new Employee(1, "sriya", 1000.00));
		emp.add(new Employee(2, "sriiya", 1600.00));
		emp.add(new Employee(3, "rii", 1200.00));

		Collections.sort(emp);//salary  lai sort garxa
		for (Employee e : emp) {
			System.out.println(e.name);//salary ko base maa result aauxa
			//System.out.println(e.salary);

		}

	}

}
