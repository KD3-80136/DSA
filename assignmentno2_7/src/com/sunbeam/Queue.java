package com.sunbeam;
import java.util.*;
public class Queue 
{private int arr[];
private int rear, front;
private final int SIZE;
public Queue(int size) {
	SIZE = size;

	arr = new int[SIZE];
	front = 0;
	rear = 0;
}
public void push(int data) {
	

	// a. add data at rear index
	arr[rear] = data;
	rear++;
	// b. reposition rear (inc)
}

public void pop() {
	// a. reposition front
	front++;
}

public int peek() {
	//a. read/return data of front + 1 index
	return arr[front];
}

public boolean isFull() {
	return rear == SIZE;
}

public boolean isEmpty() {
	return rear == front;
}
}
