package com.wipro.flowcontrol;

public class Ex18 {

	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int r,x,rev=0;
		x=a;
		while(a>0)
		{
			r=a%10;
			rev=rev*10+r;
		}
		
		if(x==rev)
		{
			System.out.println(x+" is a pallindrome");
		}
		else
			System.out.println(x+" is not  pallindrome");
		// TODO Auto-generated method stub

	}

}
