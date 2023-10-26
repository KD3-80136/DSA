package com.sunbeam;
import java.util.*;
public class NonRepeating
{
	public static int binarySearch(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;
			
		while(left <= right) {
			mid = (left + right)/2;
			if(key == arr[mid])
				return mid;	
			else if(key < arr[mid])
				right = mid - 1;
			else
				left = mid + 1;		
		}
	
			return -1;
	}
	public static int linear_search(int arr[], int size, int key) {
        for(int i = 0 ; i < size ; i++) {
        	if(arr[i] == key)
        		return i;
        }
        return -1;
	}
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, arr.length, key);
		if(index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();
	}
}
