package com.test1;

class Car {
	private int speed;
	private String color;
	private String brand;
	
    public Car(){
    	color = "Green";
    }
    public Car(int X, String Y, String Z) {
    	speed = X;
    	color = Y;
    	brand = Z; 
    }
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
    
}

public class Main{
	public static void main(String[] args) {
		Car Mitsubushi = new Car();
		String output = Mitsubushi.getColor();
		System.out.println(output);
	}

}
