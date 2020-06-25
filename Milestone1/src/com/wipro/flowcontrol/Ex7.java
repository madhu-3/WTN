package com.wipro.flowcontrol;

public class Ex7 {

	public static void main(String[] args) {
		String a=args[0];
		char x=a.charAt(0);
		if(x>=65&&x<=90)
			System.out.println(x+"->"+a.toLowerCase());
		else
			System.out.println(x+"->"+a.toUpperCase());
		// TODO Auto-generated method stub

	}

}
