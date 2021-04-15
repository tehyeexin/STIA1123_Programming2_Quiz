package Quiz1;

import java.util.Scanner;

public class Laptop {
	Scanner s = new Scanner(System.in);
	
	String brand;
	String color;
	String model;
	String screen;
	double weight;

	//Setter Method
	/*void setBrand() {
		System.out.println("Enter the brand : ");
		int brand = s.nextInt();
		System.out.println("The brand is " + brand);
	}*/
	
	public void setBrand(String brand) {
		System.out.println("Enter the brand : ");
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setScreen(String screen) {
		this.screen = screen;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//Getter Method
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




}
