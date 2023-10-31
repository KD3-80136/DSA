package com.sunbeam;

public class Main 
{
	public static void main(String[] args) {
		List l1=new List();
		l1.addFirst('a');
		l1.addFirst('b');
		l1.addFirst('c');
		l1.addFirst('d');
		l1.addLast('x');
		l1.addLast('y');
		l1.addLast('z');
		l1.deleteFirst();
		l1.deleteLast();
		l1.displayList();
		

	}
}
