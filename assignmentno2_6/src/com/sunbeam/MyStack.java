package com.sunbeam;

public class MyStack 
{
	private int arr[];
	private int top;
	private final int SIZE;

	public MyStack(int size) {
		SIZE = size;
		arr = new int[size];
		top = SIZE;

	}
	public void push(int data) {
		top--;
		arr[top]=data;
	}
	public void pop() {
		top++;
	
	}
	public int  peek() {
		return arr[top];
	
	}
	public boolean isFull() {
		return top==0;
	}
	public  boolean isEmpty() {
		return top==SIZE;
	}
}
