package com.sunbeam;

public class Queue 
{
	DoublyCircularLinkedList l1;
	public Queue()
	{
		l1=new DoublyCircularLinkedList();
	}
	public boolean isEmpty()
	{ 
		return l1.isEmpty(); 
		
	}
	public void push(int value)
	{
		l1.addFirst(value);
	}
	public void pop()
	{
		l1.deleteLast();
	}
	public void peek()
	{
		l1.fDisplay();
		
	}
}
