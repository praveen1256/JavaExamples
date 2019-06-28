package main;

import home.Home;

public class Human {

	int legs = 2;
	
	private int value = 10;

	public int value1 = 10;

	protected int value2 = 10;
	
	public void walk() {
		System.out.println("Walking");
		value = 30;
	}
	
	public void value2() {
		System.out.println(value2);
		Home home = new Home();
	}
	
}
