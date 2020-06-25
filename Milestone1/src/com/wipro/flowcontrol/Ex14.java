package com.wipro.flowcontrol;

public class Ex14 {

	public static void main(String[] args) {
		if(args.length==0)
			System.out.println("Please enter an integer number");
		else {
		int a=Integer.parseInt(args[0]);
		int i,flag=0;
		if(a==0||a==1)
			System.out.println("Neither prime nor composite");
			
		for(i=2;i<=a/2;i++)
		{
			if(a%i==0) {
				flag=1;
				System.out.println(a+" is Not a prime");
				break;
			}
				
		}
		if(flag==0)
			System.out.println(a+" is a prime");
		// TODO Auto-generated method stub

	}
	}

}
