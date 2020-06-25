package com.wipro.classesandobjects;
import java.lang.Math;
public class Calculator {
	static double powerDouble(double num1,double num2)
	{
		return Math.pow(num1,num2);
	}
	static double powerInt(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}

	public static void main(String[] args) {
		System.out.println(Calculator.powerDouble(2,4));
		System.out.println(Calculator.powerInt(3,4));
		
		
		// TODO Auto-generated method stub

	}

}
