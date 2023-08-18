package com.gurukul.day15;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string");
	String str = sc.next();
	if (validParenthesis(str)) {
	    System.out.println("Valid parenthesis");
	} else {
	    System.out.println("Invalid parenthesis");
	}

    }

    public static boolean validParenthesis(String str) {
	Stack<Character> s = new Stack<>();

	for (int i = 0; i < str.length(); i++) {
	    char ch = str.charAt(i);
	    if (ch == '(') {
		s.push(ch);
	    } else if (ch == ')') {
		if (s.isEmpty()) {
		    return false;
		} else {
		    s.pop();
		}

	    }
	}
	if (s.isEmpty()) {
	    return true;
	} else {
	    return false;
	}
    }

}
