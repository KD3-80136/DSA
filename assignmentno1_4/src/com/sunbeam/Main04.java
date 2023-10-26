package com.sunbeam;
import java.util.Scanner;

public class Main04
{
	static int rank = 0;

	public static int linear_search(int arr[], int size, int key) {
		for (int i = 0; i < size; i++) {
			
			if (arr[i] == key) 
			{
				rank++;
				}
			if(key>arr[i] ) 
			{
				rank++;
			}
				
		}
		
		return rank;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = linear_search(arr, arr.length, key);
		if (index != -1)
			System.out.println("Rank of an element " + rank);
		else
			System.out.println("Key is not found");

		sc.close();
	}
}
