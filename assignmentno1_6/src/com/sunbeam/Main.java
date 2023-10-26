package com.sunbeam;
import java.util.*;
public class Main
{
	public static int findNthOccur(int arr[], int size, int key,int n)
	{
		int count=0;
        for(int i = 0 ; i < size ; i++) {
        	if(arr[i] == key)
        		count++;	
        	if(count==n)
        		return i;
			
        }
        return -1;
	}

	public static void main(String[] args) {
		int arr[] = {66, 11, 33, 88, 22, 99, 77, 33};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		System.out.print("Enter nth occurence  to be searched : ");
		int n = sc.nextInt();
		
		int index = findNthOccur(arr, arr.length, key, n);
		if(index != -1)
			System.out.println("Key is found at index : " + index);
		else
			System.out.println("Key is not found");
		
		sc.close();
	}
}
