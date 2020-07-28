package com.wipro.project2;
import java.util.*;
public class Employee {
	static String[][] emp=new String[200][4];
	static int i=0;
	static void addEmployee()
	{
		//@SuppressWarnings("")
		Scanner sc=new Scanner(System.in);
		int empid,age,salary;
		String name;
		System.out.println("Enter Employee ID:");
		empid=sc.nextInt();
		System.out.println("Enter Employee Name:");
		name=sc.next();
		System.out.println("Enter Employee Age:");
		age=sc.nextInt();
		System.out.println("Enter Employee Salary:");
		salary=sc.nextInt();
		emp[i][0]=empid+"";
		emp[i][1]=name;
		emp[i][2]=age+"";
		emp[i][3]=salary+"";
		i++;
		sc.close();
	}
	static void Display()
	{
		System.out.println("-----Report----");
		int j;
		for(j=0;j<i;j++) {
		System.out.println(emp[j][0]+" "+emp[j][1]+" "+emp[j][2]+" "+emp[j][3]);
		}
		System.out.println("-----End of Report----");
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		while(b)
		{
			System.out.println("Main menu");
			System.out.println("1.Add an Employee");
			System.out.println("2.Display all");
			System.out.println("3.Exit");
			System.out.println("Select Your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: 
				{
					addEmployee();
					break;
				}
			case 2:{
				Display();
				break;
			}
			case 3:{
				System.out.println("Exiting the System...");
				b=false;
				break;
			}
			}
		}
		sc.close();
		// TODO Auto-generated method stub

	}

}
