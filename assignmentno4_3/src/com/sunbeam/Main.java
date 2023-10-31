package com.sunbeam;

public class Main 
{
	public static void main(String[] args) {
		List l1=new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(70);
		l1.addLast(50);
		l1.addFirst(60);
		l1.deleteFirst();
		l1.deleteLast();
		l1.displayList();
		int data=l1.findMidNode();
		System.out.println(" Middle element "+data);
		

	}

}
