package com.wipro.flowcontrol;

public class Ex12 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int i,flag=0;
		for(i=2;i<=a/2;i++)
		{
			if(a%i==0) {
				flag=1;
				System.out.println("Not a prime");
				break;
			}
				
		}
		if(flag==0)
			System.out.println("prime");
			
		
		// TODO Auto-generated method stub

	}

}
