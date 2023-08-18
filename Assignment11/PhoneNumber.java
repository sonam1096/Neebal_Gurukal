package com.gurukul.assignment11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	System.out.println("Enter a phone number");
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	String regex = "^\\+\\d{10}";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(str);

	if (matcher.matches()) {
	    System.out.println("Valid phone number");
	} else {
	    System.out.println("Invalid phone number");
	}

    }

}
