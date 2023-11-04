package com.sunbeam;
import java.util.Stack;
public class QueueUsingStacks<T>
{
	 private Stack<T> stack1 = new Stack<>();
	    private Stack<T> stack2 = new Stack<>();

	    public void enqueue(T element) {
	        stack1.push(element);
	    }

	    public T dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }

	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }

	        return stack2.pop();
	    }

	    public T peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }

	        if (stack2.isEmpty()) {
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }

	        return stack2.peek();
	    }

	    public boolean isEmpty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }

	    public static void main(String[] args) {
	        QueueUsingStacks<Integer> queue = new QueueUsingStacks<>();
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);

	        System.out.println("Dequeue: " + queue.dequeue()); // Output: 1
	        System.out.println("Peek: " + queue.peek()); // Output: 2
	        System.out.println("Is queue empty: " + queue.isEmpty()); // Output: false
	    }
}
