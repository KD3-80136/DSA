package com.sunbeam;

public class Tester 
{
	public static void main(String[] args) {
		Stack st = new Stack();
		System.out.println("Stack............");
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		st.push(60);
		st.peek();
		st.pop();
		st.pop();
		st.peek();
		Queue q=new Queue();
		System.out.println("Queue..............");
		q.push(70);
		q.push(80);
		q.push(90);
		q.push(100);
		q.push(110);
		q.pop();
		q.pop();
		q.peek();
	}
}
