package ArrayQuestion;

import java.util.Arrays;
import java.util.Scanner;

//anagram racer - -acerr
public class AnagramCheck {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();
		name = name.toLowerCase();
		char ch[] = name.toCharArray();
		Arrays.sort(ch);
		String n = new String(ch);

		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter 2nd name");
		String name2 = sc2.next();
		name2 = name2.toLowerCase();
		char ch2[] = name2.toCharArray();
		Arrays.sort(ch2);
		String m = new String(ch2);

		if (n.equals(m)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
