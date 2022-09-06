package com.collectionList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Student2 {
	public static void main(String[] args) {
		LinkedList<Student> list=new LinkedList<Student>();
		 //ArrayList<Student> list=new ArrayList<Student>();
		 Student st=new Student("122","sriya","texas");
		 Student st2=new Student("34","erlene","nepal");
		 
		 list.add(st);
		 list.add(st2);

		 
		 for(Student s:list) {
			
			 System.out.println(s.getId()+" "+s.getName()+" "+s.getAddress());
		 }
		 
		 
	}

}
