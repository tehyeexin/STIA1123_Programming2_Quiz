package Quiz1;

import java.util.*;

public class Laptop {
	Scanner s = new Scanner(System.in);
	
	String brand;
	String color;
	String model;
	String screen;
	double weight;

	public void setBrand() {
		System.out.println("Enter the brand : ");
		this.brand = s.next();
	}
	
	public void setColor() {
		System.out.println("Enter the color : ");
		this.color = s.next();;
	}
	
	public void setModel() {
		System.out.println("Enter the model : ");
		this.model = s.next();;
	}
	
	public void setScreen() {
		System.out.println("Enter the screen : ");
		this.screen = s.next();;
	}
	
	public void setWeight() {
		System.out.println("Enter the weight : ");
		this.weight = s.nextDouble();;
	}
	
	public String getBrand() {
		  return this.brand;
	}
	
	public String getColor() {
		  return this.color;
	}
	
	public String getModel() {
		  return this.model;
	}
	
	public String getScreen() {
		  return this.screen;
	}
	
	public double getWeight() {
		  return this.weight;
	}
	
	public void info() {
		setBrand();
		setColor();
		setModel();
		setScreen();
		setWeight();
	}




}
