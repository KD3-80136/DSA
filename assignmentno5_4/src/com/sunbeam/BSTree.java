package com.sunbeam;

public class BSTree 
{
	public class Node
	{
		private int data;
		private Node left;
		private Node right;
		public Node(int data)
		{
			this.data=data;
			left=null;
			right=null;
		}
	}
	private Node root;
	public BSTree()
	{
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
//	public void add(int data)
//	{
//		Node newNode=new Node(data);
//		if(isEmpty())
//		{
//			root=newNode;
//		}
//		else
//		{
//			Node trav=root;
//			while(true)
//			{
//				if(data<trav.data)
//				{
//					if(trav.left==null)
//					{
//						trav.left=newNode;
//						break;
//					}
//					else
//						trav=trav.left;
//				}
//				else {
//					if(trav.right==null)
//					{
//						trav.right=newNode;
//						break;
//					}
//					else
//						trav=trav.right;
//				}
//			}
//		}
//	}
	
	public void add(int data)
	{
		root=addRecursive(root,data);
	}
	//recursive approach
	public Node addRecursive(Node root,int data)
	{
		if(root==null)
			return new Node(data);
		if(data<root.data)
			root.left=addRecursive(root.left,data);
		else
			root.right=addRecursive(root.right,data);
		return root;
	}
	
	
	public void display()
	{
		displayRecursive(root);
	}
	public void displayRecursive(Node root)
	{
		if(root==null)
			return;
		
		displayRecursive(root.left);
		System.out.println(" "+root.data);
		displayRecursive(root.right);
	}

}
