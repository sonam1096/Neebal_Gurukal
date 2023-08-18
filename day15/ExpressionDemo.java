package com.gurukul.day15;

import java.util.Stack;

class Expression {
    String exp;

    Expression(String exp) {
	this.exp = exp;
    }

    String converPostfix() {
	String postfix = "";
	Stack<Character> s = new Stack<>();

	for (int i = 0; i < exp.length(); i++) {
	    char ch = exp.charAt(i);
	    if (Character.isLetter(ch)) {
		postfix += ch;
	    } else {
		if (s.isEmpty() || precedence(ch) > s.peek() || ch == '(') {
		    s.push(ch);
		} else if (ch == ')') {
		    while (!s.isEmpty() && s.peek() != '(') {
			postfix += s.pop();
		    }

		    s.pop();
		} else {
		    while (!s.isEmpty() && precedence(ch) <= precedence(s.peek())) {

			postfix += s.pop();
		    }
		    s.push(ch);
		}

	    }
	}
	while (!s.isEmpty()) {
	    postfix += s.peek();
	    s.pop();
	}
	return postfix;
    }

    int precedence(char op) {
	switch (op) {
	case '*':
	    return 3;
	case '/':
	    return 3;
	case '%':
	    return 3;
	case '+':
	    return 2;
	case '-':
	    return 2;
	case '(':
	    return 1;
	case ')':
	    return 1;
	default:
	    return 0;
	}
    }

    String postfixToInfix() {
	String infix = "";
	Stack<String> s = new Stack<>();
	for (int i = 0; i < exp.length(); i++) {
	    char ch = exp.charAt(i);

	    if (Character.isLetter(ch)) {
		s.push("" + ch);
	    } else {
		String str2 = s.pop();
		String str1 = s.pop();
		infix = str1 + ch + str2;
		s.push("(" + str1 + ch + str2 + ")");
	    }
	}

	return infix;
    }
}

public class ExpressionDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
//	Expression ex = new Expression("a+b*(c-d)/e");
	Expression ex = new Expression("ab+cd/-");

//	System.out.println(ex.converPostfix());
	System.out.println(ex.postfixToInfix());

    }

}
