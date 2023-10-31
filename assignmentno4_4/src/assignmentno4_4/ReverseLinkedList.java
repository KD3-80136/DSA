package assignmentno4_4;

public class ReverseLinkedList
{
	public static void main(String[] args) 
	{
		List l1=new List();
		l1.addFirst(10);
		l1.addFirst(20);
		l1.addFirst(30);
		l1.addFirst(40);
		l1.addFirst(60);
		l1.displayList();
		System.out.println("Reverse List : ");
		l1.reverseList();
		l1.displayList();
		
		
		

	}

}
