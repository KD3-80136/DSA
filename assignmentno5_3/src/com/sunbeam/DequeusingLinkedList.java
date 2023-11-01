package com.sunbeam;

public class DequeusingLinkedList
{
	public static void main(String[] args)
	{
		Deque deque = new Deque();
		System.out.println("Deque elements :");
		deque.addFirst(10);
		deque.addFirst(20);
		deque.addFirst(30);
		deque.addFirst(40);
		deque.addFirst(50);
		deque.display();
		System.out.println("delete from first : " + deque.deleteFirst());
		System.out.println("delete from last : " + deque.deleteLast());
		System.out.println("After deleting :");
		deque.display();

	}
}
