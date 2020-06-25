package com.wipro.flowcontrol;

public class Ex13 {

	public static void main(String[] args) {
		int i,flag=0,j;
		for(i=10;i<=99;i++)
		{
			flag=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0)
				System.out.println(i);
		}
		// TODO Auto-generated method stub

	}

}
