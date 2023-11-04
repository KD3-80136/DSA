package com.sunbeam;

public class MainTester 
{
public static void main(String[] args) 
{
		
		String postfix = "456*3/+9+7-";
		Expression exp=new Expression();
		System.out.println(exp.postfixEvalutation(postfix));
		
		String prefix = "-++4/*56397";
		System.out.println(exp.prefixEvaluation(prefix));
		
	}	

}
