package assignmentno4_4;

public class List 
{
	public class Node {
		private int data;
		private Node next;

		public Node(int value) {
			data = value;
			next = null;
		}
	}

	private Node head;
	private Node tail;

	public List() {
		head = null;
		tail = null;
	}

	public boolean isEmpty() {
		return (head == null && tail == null);
	}

	public void addFirst(int value) {
		Node newnode = new Node(value);
		if (isEmpty()) {
			head = newnode;
			tail = newnode;
		} else {
			newnode.next = head;
			head = newnode;
		}
	}
	public void addLast(int value) {

		Node newnode = new Node(value);

		if (isEmpty()) {

			head = newnode;
			tail = newnode;

		} else {

			tail.next = newnode;
			tail = newnode;

		}
	}


	public void displayList() {

		Node trav = head;
		System.out.println("List :");
		while (trav != null) {
			System.out.print(" " + trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}

public void reverseList()
{
	Node t1=head;
	Node t2=head.next;
	head.next=null;
	while(head!=null)
	{
		head=t2.next;
		t2.next=t1;
		t1=t2;
		t2=head;
	}
	head=t1;

}
}
