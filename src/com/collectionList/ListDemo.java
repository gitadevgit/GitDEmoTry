package com.collectionList;

import java.util.ArrayList;

public class ListDemo {
	public static void main(String[] args) {
	//generics
		
		ArrayList<String> list=new ArrayList<String>();
		list.add("sriya");
		//duplicate allowing
		list.add("sriya");
		list.add("erlene");
		list.add("bikash");
		list.add(3,"barkha");//place switching
		//System.out.println(list.get(3));//give value of index 4 
		//System.out.println(list.contains("sriya"));//true -check name availability
		//list.remove(0);
		//list.remove("sriya");
		//System.out.println(list.isEmpty());//false

		ArrayList<String> list2=new ArrayList<String>();
		list2.add("emy");
		list2.add("jerry");
		
//		ArrayList<Integer> list3=new ArrayList<Integer>();
//		list3.add(1);
//		list3.add(2);
//		System.out.println(list.addAll(list3));
		//System.out.println(list.addAll(list2));
		
//		System.out.println(list);
//		for(String n:list) {
//			System.out.println(n);
//		}
//		for(int i=0;i<list.size();i++) {
//			System.out.println(list.get(i));
//		}
		
	}

}