package com.wipro.Encapsulation;

 class Author {
	String name;
	String email;
	char gender;
	Author(String name,String email, char gender)
	{
		this.name=name;
		this.email=email;
		this.gender=gender;
		System.out.println("Author:"+name);
		System.out.println("maliid:"+email);
		System.out.println("gender:"+gender);
		
	}
}

 class Book extends Author{
	String name;
	double price;
	int qtyInStock;
	Book(String name,double price, int qtyInStock)
	{
		super("John","john123@gmail.com",'M');
		this.name=name;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public void display()
	{
		System.out.println("name of book :"+name);
		System.out.println("price:"+price);
		System.out.println("Available stock:"+qtyInStock);
		
	}
	
}

 public class TestEncapsulation{
	public static void main(String[] args) {
		Book b=new Book("DataStructures",10000,50);
		b.display();
		
		
		// TODO Auto-generated method stub

	}

}
