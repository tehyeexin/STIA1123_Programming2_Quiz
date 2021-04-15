package Quiz1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		Laptop asus = new Laptop();
		
		asus.getBrand();
		asus.getColor();
		asus.getModel();
		asus.getScreen();
		asus.getWeight();
		
		System.out.println("Brand  : " + asus.getBrand());
		System.out.println("Color  : " + asus.getColor());
		System.out.println("Model  : " + asus.getModel());
		System.out.println("Screen : " + asus.getScreen());
		System.out.println("Weight : " + asus.getWeight() + "kg");

	}

}
