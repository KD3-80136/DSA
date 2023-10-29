package com.sunbeam;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int choice;
		MyStack s = new MyStack(4);

		while (!exit) {
			System.out.println("Enter your choice");
			System.out.println("1.push");
			System.out.println("2.pop");
			System.out.println("3.peek");
			System.out.println("100.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				if (s.isFull()) {
					System.out.println("Stack is full");
				} else {
					System.out.println("Enter a data");
					int data = sc.nextInt();
					s.push(data);
				}
				break;

			case 2:
				if (s.isEmpty()) {
					System.out.println("Stack is Empty");
				} else {
					s.pop();
					System.out.println("ele is popped");
				}
				break;
			case 3:
				if (s.isEmpty()) {
					System.out.println("Stack is Empty");
				} else {

					System.out.println("ele is peeked = " + s.peek());
				}

				break;
			case 100:
				exit = true;
				break;
			}
		}
	}
}
