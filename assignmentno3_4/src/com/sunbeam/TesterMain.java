package com.sunbeam;
import java.util.LinkedList;
import java.util.Queue;


class StackUsingQueues<T> 
{

	private Queue<T> primaryQueue = new LinkedList<>();
	private Queue<T> secondaryQueue = new LinkedList<>();

	public void push(T element) {
		primaryQueue.offer(element);
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}
		while (primaryQueue.size() > 1) {
			secondaryQueue.offer(primaryQueue.poll());
		}
		T topElement = primaryQueue.poll();
		Queue<T> temp = primaryQueue;
		primaryQueue = secondaryQueue;
		secondaryQueue = temp;

		return topElement;
	}

	public T top() {
		if (isEmpty()) {
			throw new IllegalStateException("Stack is empty");
		}

		T topElement = null;

			while (!primaryQueue.isEmpty()) {
			topElement = primaryQueue.poll();
			secondaryQueue.offer(topElement);
		}

		
		Queue<T> temp = primaryQueue;
		primaryQueue = secondaryQueue;
		secondaryQueue = temp;

		return topElement;
	}
	 public boolean isEmpty() {
	        return primaryQueue.isEmpty();
	    }

}

public class TesterMain 
{
	public static void main(String[] args) {
		StackUsingQueues<Integer> stack = new StackUsingQueues<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);

		System.out.println("Top element: " + stack.top()); // Output: 3
		System.out.println("Popped element: " + stack.pop()); // Output: 3
		System.out.println("Top element after pop: " + stack.top()); // Output: 2
		System.out.println("Is stack empty: " + stack.isEmpty()); // Output: false
	}
}
