package com.sunbeam;

import java.util.Scanner;

public class TesterMain 
{
	public static void main(String[] args) {
		Stack stack=new Stack(10);
		int max=Integer.MIN_VALUE;
		Scanner scanner= new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			System.out.print("Enter number "+i+":");
			int num=scanner.nextInt();
			if(num>max)
				max=num;
			stack.push(num);
		}
		
		System.out.println("Max number is:"+max);
		scanner.close();
	}
}
