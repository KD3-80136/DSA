package com.sunbeam;

public class Stack 
{
	DoublyCircularLinkedList l1;
	public Stack()
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
		l1.deleteFirst();
	}
	public void peek()
	{
		l1.fDisplay();
		
	}
}
