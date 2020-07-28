package com.wipro.wrapper;

public class P2 {
	static void fun(int i)
	{
		System.out.println("int");
	}
	static void fun(Integer i)
	{
		System.out.println("Integer");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		fun(b);

	}

}
