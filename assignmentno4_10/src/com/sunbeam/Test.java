package com.sunbeam;
import java.util.*;
public class Test
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice;
		Employee emp = new Employee();

		do {
			System.out.println("1.add\n2.display\n3.search\n4.delete by id\n5.update");
			System.out.println("Enter choice = ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				scanner.nextLine();
				System.out.println("Enter name = ");
				String name = scanner.nextLine();
				System.out.println("Enter id = ");
				int id = scanner.nextInt();
				Employee e = new Employee(name, id);
				emp.addEmployee(e);
				break;
			case 2:
				emp.displayList();
				break;
			case 3:
				scanner.nextLine();
				System.out.println("Enter name to be searched = ");
				String keyName = scanner.nextLine();
				emp.linearSearch(keyName);
				break;
			case 4:
				System.out.println("Enter id = ");
				int keyId = scanner.nextInt();
				emp.searchDelete(keyId);

				break;
			case 5:
				System.out.println("Enter id to update name = ");
				int keyIdForUpdate = scanner.nextInt();
				emp.updateEmployeeName(keyIdForUpdate, scanner);
				break;
			}
		} while (choice != 0);

	}
}
