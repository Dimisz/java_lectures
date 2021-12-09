package com.uningen.exercises;

public class BoxDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Box box1 = new Box(5, 6, 7);
		Box box2 = new Box(10);
		Box box3 = new Box(-1, -2, 5);
		Box box4 = new Box(0);
		
		box1.PrintBox();
		box2.PrintBox();
		
		box1.setLength(3);
		box1.setWidth(4);
		box1.setHeight(5);
		box1.PrintBox();
		
		System.out.println("Checking getters...");
		System.out.println(box1.getVolume());
		System.out.println(box1.getSurfaceArea());
		System.out.println("Getters checked");
		
		System.out.println("Setting invalid value for length...");
		box1.setLength(-5);
		box1.PrintBox();
		
		box3.PrintBox();
		box4.PrintBox();
	}

}
