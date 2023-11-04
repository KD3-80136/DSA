package assignmentno3_2;

import java.util.Arrays;

public class TesterMain 
{
public static void main(String[] args) {
		
		int[] arr= {11,22,33,44,55};
		
		Stack st=new Stack(10);
		
		System.out.println(Arrays.toString(arr));
		
		int len=arr.length-1;
		for(int i=0;i<=len;i++)
		{
			st.push(arr[i]);
		}
		
		int j=0;
		while(!st.isEmpty())
		{
			arr[j]=st.pop();
			j++;
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
