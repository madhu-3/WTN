package com.wipro.ExceptionHandling;
import java.util.Scanner;
public class Exceptiontest1 {
	public int division(int a,int b)
	{
		return a/b;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try
		{
			Exceptiontest1 obj=new Exceptiontest1();
			System.out.println(obj.division(a, b));
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException");
			
		}
		finally{
			sc.close();
		}
	}

}
