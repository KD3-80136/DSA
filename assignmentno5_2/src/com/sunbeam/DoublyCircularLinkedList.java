package com.sunbeam;

public class DoublyCircularLinkedList 
{
	public class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	public  DoublyCircularLinkedList() {
		
	 
		head = null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head == null && tail == null;
	}
	
	public void addFirst(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(isEmpty())
			//a. add newnode into head and tail
			head = tail = nn;
		//3. if list is not empty
		else {
			//a. add first node into next of newnode
			nn.next = head;
			//b. add newnode into prev of first node
			head.prev = nn;
			//c. move head on newnode
			head = nn;
		}
	}
	
	public void addLast(int value) {
		//1. create node
		Node nn = new Node(value);
		//2. if list is empty
		if(isEmpty())
			//a. add newnode into head and tail
			head = tail = nn;
		//3. if list is not empty
		else {
			//a. add last node into prev of newnode
			nn.prev = tail;
			//b. add newnode into next of last node
			tail.next = nn;
			//c. move tail on newnode
			tail = nn;
		}
	}
	public void deleteFirst() {
		//1. if list is empty
		if(isEmpty())
			// print msg
			System.out.println("List is empty");
		//2. if list has single node
		else if(head.next == null)
			head = tail = null; 
		//3. if list has multiple node
		else {
			//a. move head on second node
			head = head.next;
			//b. add null into prev of second node
			head.prev = null;
		}
	}
	
	public void deleteLast() {
		//1. if list is empty
		if(isEmpty())
			return;
		
		else if(head.next == null)
			head = tail = null;
		
		else {
			
			tail = tail.prev;
			
			tail.next = null;
		}
	}
	public void fDisplay() {
		//1. create trav and start at head
		Node trav = head;
		System.out.print("Forward : ");
		while(trav != null) {
			//2. visit current node
			System.out.print(" " + trav.data);
			//3. go on next node
			trav = trav.next;
		}//4. repeat step 2 and 3 till last node
		System.out.println("");
	}
}
