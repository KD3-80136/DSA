package com.sunbeam;

public class Stack 
{
	private final int SIZE;
	private int[] arr;
	private int top;
	
	public Stack(int size)
	{
		SIZE=size;
		top=-1;
		arr=new int[SIZE];
	}
	
	public void push(int element)
	{
		top++;
		arr[top]=element;
	}
	
	public int pop()
	{
		int element;
		element=arr[top];
		top--;
		return element;
	}
	
	public int peek()
	{
		return arr[top];
	}
	public boolean isFull()
	{
		return top==SIZE-1;
	}
	
	public boolean isEmpty()
	{
		return top==-1;
	}
}
