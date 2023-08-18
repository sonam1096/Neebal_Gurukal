package com.gurukul.assignment11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TXT {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a string");
	String str = sc.next();

	String regex = ".*\\.txt$";

	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(str);

	if (matcher.matches()) {
	    System.out.println("Valid");
	} else {
	    System.out.println("Invalid");
	}

    }

}
