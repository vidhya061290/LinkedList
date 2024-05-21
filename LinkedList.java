package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {
private Node<T> head;
public void prepend(T value) {
	Node<T> node = new Node<T>(value);
	node.setNext(this.head);
	this.head = node;	
}

public void append(T value) {
	Node<T> newNode = new Node<T>(value);
	Node<T> i = this.head;
	if(i==null) {
		this.head = newNode;
		return;
	}
	while(i.getNext() != null) {
		i = i.getNext();
	}
	i.setNext(newNode);
	}

public void remove() {
	if(this.head == null)return;
	this.head = head.getNext();
}

public String toString() {
	List<T> list = new ArrayList<>();
	Node<T> i = this.head;
	while(i != null) {
		list.add(i.getValue());
		i = i.getNext();
	}
		return list.toString();
	}

public void removeNode(T value ) {
//	Node<T> prevNode = new Node<T>(value);
	Node<T> currNode = this.head;
	
    while(head != null  &&  head.getValue() == value) {
	this.head = head.getNext();
	} 
    while(currNode != null && currNode.next != null) {
		 if(currNode.next.getValue() == value) {
			currNode.next = currNode.next.next;
		 }else
		 {
		 currNode= currNode.next;
		 }
	
}
}
}

