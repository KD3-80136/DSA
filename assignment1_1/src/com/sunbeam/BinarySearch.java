package com.sunbeam;
import java.util.*;
public class BinarySearch 
{
	static int noOfcomp = 0;

	public static int binarySearch(int arr[], int size, int key) {
		int left = 0, right = size - 1, mid;

		while (left <= right) {
			// 2. find middle element of the array
			mid = (left + right) / 2;
			// 3. compare middle element with key
			if (key == arr[mid]) {
				noOfcomp++;
				return mid;
			}
			// if key is matching then return mid
			// 4. if key is less than middle element
			else if (key < arr[mid]) {
				noOfcomp++;
				right = mid - 1;
			}
			// search key into left sub array
			// 5. if key is greater than middle element
			else {
				noOfcomp++;
				left = mid + 1;
			}
			// search key into right sub array
		} // 6. repeat step 2 to 5 till valid partition
			// 7. if key is not found return -1
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 11, 22, 33, 44, 55, 66, 77, 88, 99 };

		// 1. take key from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to be searched : ");
		int key = sc.nextInt();

		int index = binarySearch(arr, arr.length, key);
		if (index != -1)
			System.out.println("Key is found at index " + index);
		else
			System.out.println("Key is not found");
		System.out.println("Comparison = " + noOfcomp);

		sc.close();
	}
}
