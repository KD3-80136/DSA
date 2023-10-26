package com.sunbeam;
import java.util.*;
public class Main 
{
	public static int SearchById(Employee arr[], int size, int key) {
		int left = 0, right = size - 1, mid;

		while (left <= right) {
			
			mid = (left + right) / 2;
			if (key == arr[mid].getEmpid())
				return mid; 
			else if (key < arr[mid].getEmpid())
				right = mid - 1; 
				left = mid + 1; 
		} 
		return -1;
	}
	public static int SearchByName(Employee arr[], int size, String key) {
        for(int i = 0 ; i < size ; i++) 
        {
		
        	if(arr[i].getName().equals(key))
        		return i;	
	       }
        
        return -1;
	}
	public static int SearchBySalary(Employee arr[], int size, double key) {
		int left = 0, right = size - 1, mid;

		while (left <= right) {
			mid = (left + right) / 2;
			if (key == arr[mid].getSalary())
				return mid; 
			else if (key < arr[mid].getSalary())
				right = mid - 1; 
			else
				left = mid + 1; 
		} 
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		int choice;
		int index ;
		Employee arr[] = new Employee[3];
		arr[0] = new Employee(1, "Bhumika", 100);
		arr[1] = new Employee(2, "Chitrali", 200);
		arr[2] = new Employee(3, "Rutuja", 300);

		while (!exit) {
			System.out.println("Enter your choice");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter a id u want to Search");
				int id = sc.nextInt();

				 index = SearchById(arr, 3, id);
				if (index != -1)
					System.out.println("Key is found at index " + index);
				else
					System.out.println("Key is not found");
				break;
			case 2:
				System.out.println("Enter a name u want to Search");
				String name  = sc.next();
				 index = SearchByName(arr,3,name);
					if (index != -1)
						System.out.println("Key is found at index " + index);
					else
						System.out.println("Key is not found");
				break;
			case 3:
				System.out.println("Enter a Salary u want to Search");
				double  sal  = sc.nextDouble();
				 index = SearchBySalary(arr,3,sal);
					if (index != -1)
						System.out.println("Key is found at index " + index);
					else
						System.out.println("Key is not found");
				break;
			case 100:
				exit = true;
				break;
			}

		}

	}

}
