package com.string;

public class StringTry {
	public static void main(String[] args) {
		String name ="radar";
			String name2 = "";

		for (int i = name.length() - 1; i >= 0; i--) {
			name2 = name2 + name.charAt(i);
		}
		System.out.println(name2);
		
		if (name.equals(name2)) {
			System.out.println("palindrom");
		} else {
			System.out.println("not palindrome");
		}
	}
}
