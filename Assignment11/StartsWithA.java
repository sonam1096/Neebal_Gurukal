package com.gurukul.assignment11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsWithA {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String str = sc.next();

	String regex = "^[aA].*";

	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(str);

	if (matcher.matches()) {
	    System.out.println("Valid");
	} else {
	    System.out.println("Invalid");
	}

    }

}
