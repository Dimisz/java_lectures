package com.lq.exercises;

public class Box {
	private double length;
	private double width;
	private double height;
	
	
	
	public Box(double length, double width, double height) {
		super();
		if (length > 0) {
			this.length = length;
		} else {
			this.length = 1;
			System.out.println("Length must be greater than 0...");
			System.out.println("Assigned 1 as default value");
		}
		
		if (width > 0) {
			this.width = width;
		} else {
			this.width = 1;
			System.out.println("Width must be greater than 0...");
			System.out.println("Assigned 1 as default value");
		}
		
		if (height > 0) {
			this.height = height;
		} else {
			this.height = 1;
			System.out.println("Height must be greater than 0...");
			System.out.println("Assigned 1 as default value");
		}
	}
	
	Box(double side){	
		if (side > 0) {
			this.length = side;
			this.width = side;
			this.height = side;
			
		} else {
			this.length = 1;
			this.width = 1;
			this.height = 1;
			System.out.println("The value must be GREATER THAN 0");
			System.out.println("Assigned 1 as default value");
		}
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if (height > 0) {
			this.height = height;
		} else {
			System.out.println("Height must be greater than 0");
		}
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		if (width > 0) {
			this.width = width;
		} else {
			System.out.println("Width must be greater than 0");
		}
	}
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		if (length > 0) {
			this.length = length;
		} else {
			System.out.println("Length must be greater than 0");
		}
	}
	
	
	public double getVolume() {
		return (this.height * this.width * this.length);
	}
	
	public double getSurfaceArea() {
		return ((2*this.length*this.width)+(2*this.length*this.height)+(2*this.height*this.width));
	}
	
	public void PrintBox() {
		if (length <= 0 || height <= 0 || width <= 0) {
			System.out.println("Box contains invalid attribute");
		} else {
			System.out.println("===================");
			System.out.println("Length = " + getLength());
			System.out.println("Width = " + getWidth());
			System.out.println("Height = " + getHeight());
			System.out.println("Volume = " + getVolume());
			System.out.println("Surface Area = " + getSurfaceArea());
			System.out.println("===================");
		}
	}
	
}
