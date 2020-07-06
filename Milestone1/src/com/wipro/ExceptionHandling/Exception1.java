package com.wipro.ExceptionHandling;
import java.util.*;
class Exception1 {

	public static void main(String[] args) {
		int n,search;
        Scanner s = new Scanner(System.in);
        try {
        System.out.print("Enter the number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        String x;
        System.out.println("Enter the elements in the array:");
        for(int i = 0; i < n; i++)
        {
        	x=s.next();
            a[i]=Integer.parseInt(x);
        }
       System.out.print("Enter the index of the array element you want to access");
       search=s.nextInt();
       System.out.println("The array element at index "+search+" is"+a[search]);
       System.out.println("The array element successfully accessed");
       
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }
        catch(NumberFormatException e1) {
        	System.out.println(e1);
        }
        finally {
        	s.close();
        }
        }
	

}
