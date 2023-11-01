package com.sunbeam;
class Node {
	int data;
	Node next;
	Node prev;

	public Node(int value) {
		data = value;
		next = null;
		setPrev(null);
	}

	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}

}
public class Deque 
{
	private Node head;
	private Node tail;

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = tail = newnode;
		else {
			newnode.next = head;
			head.prev = newnode;
			head = newnode;

		}

	}

	public void addLast(int value) {
		Node newnode = new Node(value);
		if (isEmpty())
			head = tail = newnode;
		else {
			newnode.prev = tail;
			tail.next = newnode;
			tail = newnode;

		}

	}

	public int deleteFirst() {
		if (isEmpty())
			System.out.println("List is empty ");

		int data = head.data;
		if (head == tail)
			head = tail = null;

		else {
			head = head.next;
			head.prev = null;
		}
		return data;
	}

	public int deleteLast() {
		if (isEmpty())
			System.out.println("List is empty ");

		int data = tail.data;
		if (head == tail)
			head = tail = null;

		else {
			tail = tail.prev;
			tail.next = null;
		}
		return data;
	}

	public void display() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
}
