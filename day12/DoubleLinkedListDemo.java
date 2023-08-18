package com.gurukul.day12;

class DoubleLinkedList<T extends Comparable> {
    private Node<T> first = null;

    private static int count;
    private static int max;

    public Node<T> getFirst() {
	return first;
    }

    public void setFirst(Node<T> first) {
	this.first = first;
    }

    public void add(T data) {
	Node newNode = new Node(data);
	if (first == null) {
	    first = newNode;
	} else {
	    Node temp = first;
	    while (temp.getNext() != null) {
		temp = temp.getNext();
	    }
	    temp.setNext(newNode);
	    newNode.setPrev(temp);
	}
	count++;
    }

    public void printNormal() {
	String msg = "[ ";
	Node<T> temp = first;
	while (temp != null) {

	    msg += (temp.getData() + " ");
	    temp = temp.getNext();
	}
	msg += "]";
	System.out.println(msg);
	;
    }

    public void printReverse() {
	String msg = "[ ";
	Node<T> temp = first;
	while (temp.getNext() != null) {
	    temp = temp.getNext();
	}
	while (temp != null) {

	    msg += (temp.getData() + " ");
	    temp = temp.getPrev();
	}
	msg += "]";
	System.out.println(msg);
	;
    }

    public boolean delNode(T data) {
	Node temp = first;

	while (temp != null) {
	    if (temp.getData() == (data)) {
		break;
	    }
	    temp = temp.getNext();
	}

	if (temp == null) {
	    return false;
	}

	if (temp == first) {
	    first = temp.getNext();
	    if (first != null) {
		first.setPrev(null);
	    }
	    return true;
	} else {
	    if (temp.getNext() == null) {
		temp.getPrev().setNext(null);
		return true;
	    } else {
		temp.getPrev().setNext(temp.getNext());
		temp.getNext().setPrev(temp.getPrev());
		return true;
	    }
	}
    }

}

public class DoubleLinkedListDemo {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
	DoubleLinkedList<Integer> x = new DoubleLinkedList<Integer>();
	x.add(10);
	x.add(20);
	x.add(30);
	x.add(40);
//	x.add(30);
	x.delNode(20);
	x.printNormal();
//	x.reverse();
//	boolean a = x.delNode(30);
//	if (a) {
//	    System.out.println("Deleted the node successfully!");
//	} else {
//	    System.out.println("Can't delete the node");
//	}
//	x.insert(50, 20);
//	boolean b = x.insertAt(60, 4);
//	if (b) {
//	    System.out.println("Added the node at the given index successfully!");
//	} else {
//	    System.out.println("Can't add the node");
//	}
//	System.out.println(x);
//	System.out.println("The count of linked list is: " + x.count());
//	System.out.println("The max node of the linked list is: " + x.max());

    }

}
