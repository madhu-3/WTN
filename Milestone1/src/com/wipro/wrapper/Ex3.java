package com.wipro.wrapper;
import java.util.*;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println(String.format("%8s",Integer.toBinaryString(a)).replace(' ', '0'));
		//System.out.println(String.format("%08d",a));
		sc.close();
		

	}

}
