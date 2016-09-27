import java.util.Scanner;
import java.lang.Math;


public class Circle {
	
	public double circumference;
	public double area;
	public static double radius;
	
	static Scanner input = new Scanner (System.in);
	
	public static double radiusValidator(){
		
	
		
		System.out.println("Please enter the radius (With at least two decimal spaces): ");
		
		radius = input.nextDouble();
		
		while(radius <= 0){
			
			System.out.println("That is an invalid number. Pleas bout in a number with at least two decimal spaces");
			
			 radius = input.nextDouble();
			 
			}
		
		return radius;
			
	}
	
	
	public static double getCircumference(){
		
		double circumference;
		
		circumference = 2 * Math.PI * radius;
		
		
		return circumference;
		
	}	
	public static String getFormattedCircumference(){
		
		String formattedCircumference = "This is the circumference:  " + formatNumber(getCircumference());
		
		return formattedCircumference;
	}

	public static double getArea(){
		

		double area;
		
//		double radiusSquare = Math.pow(input, 2);
		
		//area = pi * (radius) squared
		area = Math.PI * Math.pow(radius,2);
		
		
		return area;
	}
	
	public static String getFormattedArea(){
		
		String formattedArea = "This is the area:  " + formatNumber(getArea());
		
		return formattedArea;
	}
	
//	public static int getObjectCount(){
//		
//	}
	
	public static String formatNumber(double radius){
		
		String formattedNumber = String.format("%,.2f", radius);
		
		return formattedNumber;
	}
	
	public Circle(double radius){
		
		radius = radius; 
	}


}
