package com.sunbeam;
import java.util.*;
public class SelectionSort 
{
	public static void selectionSort(int arr[],int N)
	{
		int comparisons = 0;
		for(int i=0;i<N-1;i++)
		{
			for(int j=i+1;j<N;j++)
			{
				comparisons++; 
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		 System.out.println("Number of comparisons: " + comparisons);
	}
	
	public static void main(String[] args)
	{
		int arr[]= {44,11,55,22,66,33};
		System.out.println("Before sortiong:"+Arrays.toString(arr));
		selectionSort(arr,arr.length);
		System.out.println("After sortiong:"+Arrays.toString(arr));
		
	}
}
