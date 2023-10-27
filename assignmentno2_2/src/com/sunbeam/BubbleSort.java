package com.sunbeam;
import java.util.*;
import java.util.Arrays;

public class BubbleSort 
{
	public static void bubblesort(int arr[],int N)
	{
		int count=0;
		for(int i=0;i<N-1;i++)
		{
			for(int j=0;j<N-i-1;j++)
			{
				count++;
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Number of comparision:"+count);
	}
	
	public static void main(String[] args) 
	{
		int arr[]= {33,22,66,55,44,11};
		System.out.println("Before Sorting:"+Arrays.toString(arr));
		bubblesort(arr,arr.length);
		System.out.println("After sorting:"+Arrays.toString(arr));
	}
}
