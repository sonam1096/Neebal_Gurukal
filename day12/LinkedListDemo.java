package com.gurukul.day12;

class Node<T extends Comparable> {
    private T data;
    private Node<T> next;
    private Node<T> prev; // this is for double linked list as they are in same package.

    public T getData() {
	return data;
    }

    public void setData(T data) {
	this.data = data;
    }

    public Node<T> getNext() {
	return next;
    }

    public void setNext(Node<T> next) {
	this.next = next;
    }

    public Node(T data) {
	super();
	this.data = data;
    }

    @Override
    public String toString() {
	return "Node [data=" + data + "]";
    }

    public Node<T> getPrev() {
	return prev;
    }

    public void setPrev(Node<T> prev) {
	this.prev = prev;
    }

}

class LinkedList<T extends Comparable> {
    private Node<T> first = null;

    public Node<T> getFirst() {
	return first;
    }

    public void setFirst(Node<T> first) {
	this.first = first;
    }

    private static int count;
    private static int max;

    void add(T data) {
	Node<T> newnode = new Node<T>(data);
	if (first == null) {
	    first = newnode;
	} else {
	    Node<T> temp = first;
	    while (temp.getNext() != null) {
		temp = temp.getNext();
	    }
	    temp.setNext(newnode);
	}
	count++;
    }

    public String toString() {
	String msg = "[ ";
	Node<T> temp = first;
	while (temp != null) {

	    msg += (temp.getData() + " ");
	    temp = temp.getNext();
	}
	msg += "]";
	return msg;
    }

    public int count() {
	// TODO Auto-generated method stub

	return getCount();
    }

    public static int getCount() {
	return count;
    }

    public static void setCount(int count) {
	LinkedList.count = count;
    }

    public boolean delNode(T data) {
	// TODO Auto-generated method stub
	if (first.getData() == data) {
	    first = first.getNext();
	    count--;
	    return true;
	}
	Node temp = first;
	while (temp.getNext() != null) {
	    if (temp.getNext().getData() == data) {
		temp.setNext(temp.getNext().getNext());
		count--;
		return true;
	    }
	    temp = temp.getNext();
	}
	return false;

    }

    public boolean insert(T data, T afterdata) {
	// TODO Auto-generated method stub
	Node<T> toInsert = new Node(data);
	Node<T> temp = first;
	while (temp != null) {
	    if (temp.getData() == afterdata) {
		Node after = temp.getNext();
		temp.setNext(toInsert);
		toInsert.setNext(after);
		count++;
		return true;
	    }
	    temp = temp.getNext();
	}
	return false;

    }

    public void reverse() {
	// TODO Auto-generated method stub

	Node<T> temp = first;
	Node<T> curr = first;
	Node<T> pre = null;
	while (temp != null) {
	    curr = curr.getNext();
	    temp.setNext(pre);
	    pre = temp;
	    temp = curr;
	}
	first = pre;
    }

    public T max() {
	// TODO Auto-generated method stub
	Node<T> temp = first;
	T max = temp.getData();
	while (temp != null) {
	    if (temp.getData().compareTo(max) > 0) {
		max = temp.getData();
	    }
	    temp = temp.getNext();
	}

	return max;
    }

    public boolean insertAt(T data, int index) {
	// TODO Auto-generated method stub
	Node<T> newNode = new Node(data);
	if (index < 0 || index > count) {
	    return false;
	} else {
	    if (index == 0) {
		newNode.setNext(first);
		first = newNode;
	    }
	    Node temp = first;
	    for (int i = 0; i < index - 1; i++) {
		temp = temp.getNext();
	    }
	    Node after = temp.getNext();
	    temp.setNext(newNode);
	    newNode.setNext(after);
	    count++;
	    return true;
	}

    }

}

public class LinkedListDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	LinkedList<Integer> x = new LinkedList<Integer>();
	x.add(10);
	x.add(20);
	x.add(30);
	x.add(40);
	System.out.println(x);
	x.reverse();
	boolean a = x.delNode(30);
	if (a) {
	    System.out.println("Deleted the node successfully!");
	} else {
	    System.out.println("Can't delete the node");
	}
	x.insert(50, 20);
	boolean b = x.insertAt(60, 4);
	if (b) {
	    System.out.println("Added the node at the given index successfully!");
	} else {
	    System.out.println("Can't add the node");
	}
	System.out.println(x);
	System.out.println("The count of linked list is: " + x.count());
	System.out.println("The max node of the linked list is: " + x.max());

    }

}
