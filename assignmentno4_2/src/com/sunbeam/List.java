package com.sunbeam;

public class List
{
	public class Node {
		private char data;
		private Node next;

		public Node(char value) {
			data = value;
			next = null;
		}

	}

	private Node tail;
	private int count;

	public List() {
		tail = null;
		count = 0;
	}

	public int getCount() {
		return count;

	}

	public boolean isEmpty() {
		return tail == null;
	}

	public void addFirst(char value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			tail = newnode;
			tail.next = newnode;
		} else {
			newnode.next = tail;
			Node trav = tail;
			while (trav.next != tail)
				trav = trav.next;
			trav.next = newnode;
			tail = newnode;
		}
		count++;
	}

	public void addLast(char value) {
    Node newnode=new Node(value);
    if(isEmpty()) {
    tail=newnode;
    tail.next=tail;
	}
    else
    {
    	newnode.next=tail;
    	Node trav=tail;
    	while(trav.next!=tail)
    		trav=trav.next;
    	trav.next=newnode;
    }
    count++;
	}
	public void deleteFirst()
	{
		if(isEmpty())
		{
			System.out.println("List is empty ");
			return;
		}
		else if(tail.next==tail)
		tail=null;
		else
		{
			Node trav=tail;
			while(trav.next!=tail)
				trav=trav.next;
			trav.next=tail.next;
			tail=tail.next;
		}
		count--;
	}
	public void deleteLast()
	{
		if(isEmpty()) {
			
			System.out.println("List is empty");
			return;
		}
		
		else if(tail.next == tail)
			
			tail = null;
		
		else {
			
			Node trav = tail;
			for( ; trav.next.next != tail ; trav = trav.next);
			
			
			trav.next = tail;
		}
		
		count--;
	
	}
	public void displayList() {
		if (isEmpty())
			return;
		System.out.println("List : ");
		Node trav = tail;
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != tail);
		System.out.println();

	}
}
