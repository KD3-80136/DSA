package com.sunbeam;

public class List
{
	public class Node
	{
		public int data;
		public Node next;
		public Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	
	private Node head;
	public List()
	{
		head=null;
	}
	
	public boolean isEmpty() {return head==null;}
	
	public void addFirst(int data) {
		Node nn=new Node(data);
		if(isEmpty())
		{
			head=nn;
		}
		else
		{
			nn.next=head;
			head=nn;
		}
	}
	
	public void reverse() {
		Node prev=null;
		Node current=head;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	public void addAtPoisition(int data)
	{
		Node trav=head;
		Node nn=new Node(data);
		if(head==null)
		{
			head=nn;
		}
		else
		{
			if(head.next==null || data<head.data)
			{
			nn.next=head;
			head=nn;
			}
			else
			{
				while(trav.next!=null && data>=trav.next.data)
				{
					trav=trav.next;
				}
				nn.next=trav.next;
				trav.next=nn;
			}
		}
	}
	public void display()
	{
		if(isEmpty())
			System.out.println("List is empty");
		else
		{
			Node trav=head;
			while(trav!=null)
			{
				System.out.print("->"+trav.data);
				trav=trav.next;
			}
		}
	}
}
