package com.sunbeam;

public class Main 
{
	public static void main(String[] args) 
	{
        LinkedList linkedList = new LinkedList();
        linkedList.append(64);
        linkedList.append(34);
        linkedList.append(25);
        linkedList.append(12);
        linkedList.append(22);
        linkedList.append(11);
        linkedList.append(90);

        System.out.println("Original Linked List:");
        linkedList.printList();

        // Sort the linked list using bubble sort
        linkedList.bubbleSort();

        System.out.println("Linked List after Bubble Sort:");
        linkedList.printList();
    }
}
