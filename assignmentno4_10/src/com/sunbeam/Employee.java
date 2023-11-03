package com.sunbeam;
import java.util.Iterator;
import java.util.Scanner;
public class Employee 
{
	public class Node {
		private Employee e1;
		private Node next;

		Node(Employee data) {
			e1 = data;
			next = null;
		}
	}

	private Node head;
	private String name;
	private int id;

	public Employee(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public Employee() {
		head = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addEmployee(Employee emp) {
		Node nn = new Node(emp);

		if (isEmpty()) {
			head = nn;
		} else {
			nn.next = head;
			head = nn;
		}
	}

	public void searchDelete(int id) {
		if (isEmpty()) {
			System.out.println("Empty");
		} else if (head.next == null) {
			head = null;
		} else {
			Node trav = head;
			Node prev = trav;
			while (trav != null) {
				if (trav.e1.getId() == id) {
					prev.next = trav.next;
				} else {
					prev = trav;
//					trav = trav.next;
				}
				trav = trav.next;
			}
		}
		System.out.println("record is deleted.");
	}

	public void updateEmployeeName(int id, Scanner scanner) {
		if (isEmpty())
			System.out.println("List is empty.");
		Node trav = head;
		Node prev = trav;
		while (trav != null) {
			if (trav.e1.getId() == id) {
				scanner.nextLine();
				System.out.println("Enter new name = ");
				String keyName = scanner.nextLine();
				trav.e1.setName(keyName);
				System.out.println("changed record : \n" + trav.e1.toString());
				return;
			} else {
				//System.out.println("NOT FOUND");
			}
			trav = trav.next;
		}
		System.out.println("record is updated");
	}

	public void displayList() {
		if (isEmpty())
			System.out.println("List is empty.");
		Node trav = head;
		System.out.print("List :\n");
		while (trav != null) {
			System.out.print("  " + trav.e1.toString());
			trav = trav.next;
		}
		System.out.println("");
	}

	public void linearSearch(String key) {
		if (isEmpty())
			System.out.println("List is empty.");
				Node trav = head;
				while (trav != null) 
				{
			if (key.equals(trav.e1.getName())) {
				System.out.println(trav.e1.toString() + "");
				return;
			}
			trav = trav.next;
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]\n";
	}
}
