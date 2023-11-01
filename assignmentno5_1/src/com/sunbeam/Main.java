package com.sunbeam;

public class Main
{
	public static void main(String[] args) {
		List l1=new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(50);
		l1.addPosition(40, 3);
		l1.deletePosition(3);
		l1.fDisplay();
		//l1.rDisplay();

	}

}
