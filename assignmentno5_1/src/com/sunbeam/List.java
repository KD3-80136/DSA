package com.sunbeam;

public class List 
{
	class Node {
		private int data;
		private Node next;
		public Node prev;

		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}

	}

	private Node head;
	private int count;

	public List() {
		head = null;
		count = 0;
	}

	public boolean isEmpty()

	{
		return head == null;
	}

	public int getCount() {
		return count;
	}

	public void fDisplay() {
		if (isEmpty())
			return;
		Node trav = head;
		System.out.println("Forward List : ");
		do {
			System.out.print(" " + trav.data);
			trav = trav.next;
		} while (trav != head);
		System.out.println("");
	}

//	public void rDisplay() {
//		if (isEmpty())
//			return;
//		Node trav = head.prev;
//		System.out.println("reverse List : ");
//		do {
//			System.out.print(" " + trav.data);
//			trav = trav.prev;
//		} while (trav != head.prev);
//		System.out.println("");
//	}

	public void addFirst(int value) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
			head.next = nn;
			head.prev = nn;
		} else {
			nn.next = head;
		nn.prev = head.prev;
		head.prev.next = nn;
		head.prev = nn;
		head = nn;
		}
		count++;
	}

	public void addPosition(int value, int pos) {
		Node nn = new Node(value);
		if (isEmpty()) {
			head = nn;
			head.prev = nn;
			head.next = nn;
		}
			else if(pos<1 || pos>count+1)
				return;
		 else {
			Node trav = head;
			for (int i = 1; i < pos - 1; i++)
				trav = trav.next;
			nn.next = trav.next;
			nn.prev = trav;
			trav.next = nn;
			trav.next.prev = nn;

		}
	}
		public void deletePosition(int pos)
		{
			if(isEmpty())
				return;
			else
			{
				Node trav=head;
				for(int i=1;i<pos;i++)
					trav=trav.next;
					trav.prev.next=trav.next;
				trav.next.prev=trav.prev;
				
				
			}
		}
	
	}


