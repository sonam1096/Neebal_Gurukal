package com.gurukul.assignment9;

import java.util.Scanner;

public class string12 {// run

	public static void main(String[] args) {
		// . Count Character Occurrences: Write a program that counts the occurrences of
		// each character in a given string
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence:");
		String str = sc.next();

		String s = "";
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (s.indexOf(ch) == -1) {
			s += ch;
		    }
		}
		for (int i = 0; i < s.length(); i++) {
		    int count = 0;
		    for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			if (ch == s.charAt(i)) {
			    count++;
			}
		    }
		    System.out.print( "'" + s.charAt(i) + "'" + ":" + count);
		}
	   

	
	}

}
