package com.wipro.arrays;

public class Ex1 {

	public static void main(String[] args) {
		int i,s=0;
		for(i=0;i<args.length;i++)
		{
			s=s+Integer.parseInt(args[i]);
		}
		System.out.println("Sum is "+s);
		System.out.println("Average  is "+s/args.length);
		
		// TODO Auto-generated method stub

	}

}
