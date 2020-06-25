package com.wipro.classesandobjects;

public class Box {
	int width,depth,height;
	Box(int width, int depth, int height) {
		this.width = width;
		this.depth = depth;
		this.height = height;
	}
	public double volume()
	{
		return width*depth*height;
	}

	public static void main(String[] args) {
		Box b1=new Box(1,2,3);
		System.out.println(b1.volume());
		// TODO Auto-generated method stub

	}

}
