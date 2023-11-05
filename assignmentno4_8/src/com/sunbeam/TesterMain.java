package com.sunbeam;

public class TesterMain 
{
public static void main(String[] args) {
		
		List list=new List();
		list.addFirst(50);
		list.addFirst(40);
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10);
		list.addFirst(8);
		list.addFirst(6);
		list.addFirst(4);
	
		
		list.display();
		System.out.println();

		list.addAtPoisition(25);
		list.addAtPoisition(2);
		list.addAtPoisition(10);
		list.addAtPoisition(55);
		
		list.display();
	}
}
