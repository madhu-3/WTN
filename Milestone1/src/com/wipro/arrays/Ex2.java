package com.wipro.arrays;

public class Ex2 {

	public static void main(String[] args) {
		int max=-1,min=9999,i;
		for(i=0;i<args.length;i++)
		{
			if (max<Integer.parseInt(args[i]))
			{
				max=Integer.parseInt(args[i]);
			}
			if (min>Integer.parseInt(args[i]))
			{
				min=Integer.parseInt(args[i]);
			}
			
		}
		System.out.println("max is "+ max);
		System.out.println("min  is "+ min);
		// TODO Auto-generated method stub

	}

}
