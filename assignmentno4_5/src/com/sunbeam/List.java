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
	
	public void addAfterNode(int data,int nodePositionData)
	{
		Node nn=new Node(data);
		if(isEmpty() || head.next==null)
		{
			head=nn;
		}
		else
		{
			Node trav=head;
			while(trav!=null)
			{
				if(trav.data==nodePositionData)
					break;
				trav=trav.next;	
			}
			nn.next=trav.next;
			trav.next=nn;
		}
	}
	public void addBeforeNode(int data,int nodePositionData)
	{
		Node nn=new Node(data);
		if(isEmpty() || head.next==null)
		{
			head=nn;
		}
		else
		{
			Node trav=head;
			while(trav!=null)
			{
				if(trav.next.data==nodePositionData)
					break;
				trav=trav.next;	
			}
			nn.next=trav.next;
			trav.next=nn;
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
