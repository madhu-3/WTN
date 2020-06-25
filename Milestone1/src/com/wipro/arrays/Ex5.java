package com.wipro.arrays;

public class Ex5 {

	public static void main(String[] args) {
		int max1=0,max2=0,min1=9999,min2=9999,i,x;
		for(i=0;i<args.length;i++)
		{
			x=Integer.parseInt(args[i]);
			if(x>max1)
			{
				max2=max1;
				max1=x;
			}
			else if(x<max1 && x>max2)
			{
				max2=x;
			}
			if(x<min1)
			{
				min2=min1;
				min1=x;
			}
			else if(x>min1 && x<min2)
			{
				min2=x;
			}
		}
		System.out.println("First max is "+max1+"second max is "+max2);
		System.out.println("First min is "+min1+"second min is "+min2);
		// TODO Auto-generated method stub

	}

}
