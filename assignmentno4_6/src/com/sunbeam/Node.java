package com.sunbeam;

public class Node 
{
	int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

class LinkedList 
{
    Node head;

    // Method to add a new node to the linked list
    void append(int data) 
    {
        Node newNode = new Node(data);
        if (head == null)
        {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null)
        {
            last = last.next;
        }
        last.next = newNode;
    }

    // Method to print the linked list
    void printList() {
        Node current = head;
        while (current != null) 
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Bubble sort algorithm to sort the linked list
    void bubbleSort() 
    {
        if (head == null || head.next == null) 
        {
            return;
        }

        boolean swapped;
        Node current;
        Node runner = null;

        do
        {
            swapped = false;
            current = head;

            while (current.next != runner) 
            {
                if (current.data > current.next.data) 
                {
                    // Swap data of adjacent nodes
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swapped = true;
                }
                current = current.next;
            }
            runner = current;
        } while (swapped);
    }
}

