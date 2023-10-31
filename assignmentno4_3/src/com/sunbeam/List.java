package com.sunbeam;

public class List 
{
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public List() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return (head == null && tail == null);
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}

	public void displayList() {

		Node trav = head;
		System.out.println("List :");
		while (trav != null) {
			System.out.println(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	public void addLast(int value) {

		Node newnode = new Node(value);

		if (isEmpty()) {

			head = newnode;
			tail = newnode;

		} else {

			tail.next = newnode;
			tail = newnode;

		}
	}

	public void deleteFirst() {
		if (isEmpty())
			System.out.println("List is empty ");
		else
			head = head.next;

	}

	public void deleteLast() {
		if (isEmpty())
			System.out.println("List is empty ");
		else if (head.next == null)
			head = null;
		else
			tail = head;
		while (tail.next.next != null)
			tail = tail.next;
		tail.next = null;

	}
public int findMidNode()
{
	Node fast;
	Node slow;
	fast=head;
	slow=head;
	while(fast!=null && fast.next!=null)
	{
	fast=fast.next.next;
	slow=slow.next;
	}
	return slow.data;
}
}
