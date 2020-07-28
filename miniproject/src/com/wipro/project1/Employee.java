package com.wipro.project1;
@SuppressWarnings("serial")
class InvalidEmployeeIDException extends Exception{
	InvalidEmployeeIDException(String s)
	{
		super(s);
	}
}
public class Employee {
	//-------------------------------------Employee table----------------------------------
	static String empTable[][]=new String[][] {
		                                {"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
		                                {"1002","Sushma","23/08/2012","c","PM","30000","12000","9000"},
		                                {"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
		                                {"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
		                                {"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
		                                {"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
		                                {"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}
		                                };                             
//----------------------------------------Datble-----------------------------------------------		                                
		                                
   static String[][] daTable = new String[][] {
		                            		{"e", "Engineer", "20000"},
		                            		{"c", "Consultant", "32000"},
		                            		{"k", "Clerk", "12000"},
		                            		{"r", "Receptionist", "15000"},
		                            		{"m", "Manager", "40000"}
		                            	};
		                            	
	//------------------------------Method to get the DA from yhe Da table--------------------------------	                            	
		static int findDa(String e)
		{
			switch(e)
			{
			case "e":return Integer.parseInt(daTable[0][2]);
			case "c":return Integer.parseInt(daTable[1][2]);
			case "k":return Integer.parseInt(daTable[2][2]);
			case "r":return Integer.parseInt(daTable[3][2]);
			case "m":return Integer.parseInt(daTable[4][2]);
			}
			return 0;
		}
	//---------------------Method to calculate the salary---------------------------------------------------	
	static int CalculateSalary(int basic,int hra,int da,int it)
	{
		return basic+hra+da-it;
	}
	//----------------------Method to get Designation-----------------------------------------------
	static String finddesignation(String p)
	{
		switch(p)
		{
		case "e":return daTable[0][1];
		case "c":return daTable[1][1];
		case "k":return daTable[2][1];
		case "r":return daTable[3][1];
		case "m":return daTable[4][1];
		}
		return "";
	}
	//----------------Method to get Details----------------------------------------------------------
	static void Details(int empno) throws InvalidEmployeeIDException
	{
		int i;
		String empname,dep,des,sal;
		for(i=0;i<7;i++)
		{
			if(empno==Integer.parseInt(empTable[i][0]))
			{
				empname=empTable[i][1];
				dep=empTable[i][4];
				des=finddesignation(empTable[i][3]);
				sal=String.valueOf(CalculateSalary(Integer.parseInt(empTable[i][5]),Integer.parseInt(empTable[i][6]),findDa(empTable[i][3]),Integer.parseInt(empTable[i][7])));
				System.out.printf("%-10s%-10s%-15s%-15s%-10s\n", "Emp No", "Emp Name", "Department", "Designation", "Salary");
				System.out.printf("%-10s%-10s%-15s%-15s%-10s", empno, empname, dep, des, sal);
				return;
			}
		}
		throw new InvalidEmployeeIDException("There is no employee with empid : "+empno);
	}
	public static void main(String[] args) {
		try {
			Details(Integer.parseInt(args[0]));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub
		

	}

}
