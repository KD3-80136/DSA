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
	
	public int maxValue()
	{
		int max=Integer.MIN_VALUE;
		Node trav=head;
		while(trav!=null)
		{
			if(trav.data>=max)
				max=trav.data;
			trav=trav.next;
		}
		return max;
	}

	public int minValue()
	{
		int min=Integer.MAX_VALUE;
		Node trav=head;
		while(trav!=null)
		{
			if(trav.data<=min)
				min=trav.data;
			trav=trav.next;
		}
		return min;
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
