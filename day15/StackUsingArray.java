package com.gurukul.day15;

class ArrayStack<T> {
    T arr[];
    int top = -1;

    ArrayStack() {
	arr = (T[]) new Object[10];
    }

    ArrayStack(int size) {
	arr = (T[]) new Object[size];
    }

    void push(T data) {
	if (top == arr.length - 1) {
	    throw new RuntimeException("Stack is full");
	}

	arr[++top] = data;
    }

    T pop() {
	if (top == -1) {
	    throw new RuntimeException("Stack is empty");
	}

	return arr[top--];

    }

    T peek() {
	if (top == -1) {
	    throw new RuntimeException("Stack is empty");
	}

	return arr[top];
    }

    boolean isEmpty() {
	return top == -1;
    }
}

public class StackUsingArray {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	ArrayStack<Integer> s = new ArrayStack<>();
	int x = 18;
	while (x != 0) {
	    s.push(x % 2);
	    x /= 2;
	}
	while (!s.isEmpty()) {
	    System.out.print(s.pop());
	}

    }

}
