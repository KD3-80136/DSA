package com.sunbeam;
import java.util.*;
public class OperatorPriority
{
	public static int prio(char opr) {
		switch (opr) {
		case '$':
			return 11;
		case '/':
			return 10;
		case '*':
			return 10;
		case '%':
			return 10;
		case '+':
			return 9;
		case '-':
			return 9;
		}
		return 0;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// + ,-,*,/
		System.out.println("Enter character u want to find priority");
		char ele = sc.next().charAt(0);
		System.out.println("Priority of that element " + prio(ele));

	}
}
