package com.sunbeam;

public class Main
{
	public static void main(String[] args) 
	{
		List l1=new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addLast(100);
		l1.addLast(200);
	    l1.deleteFirst();
		l1.deleteLast();
		l1.displayList();
	
		

	}
}
