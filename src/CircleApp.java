import java.util.Scanner;


public class CircleApp {

	public static void main(String[] args) {
		
		Scanner input2 = new Scanner(System.in);
		
		
		//Declarations
		double radius = 0;
		double r = 0;
		boolean  addCircle = true;
		int total = 1;
		double circumference = 0;
		double area = 0;
		
		
		//Welcome to the Application
		System.out.println("Welcome to the Circle App\n");
		
		//Caption describing the program
		System.out.println("~ ~This is where you can input any radius and you can creat a circle!!!~ ~\n");
		
		while(addCircle){
			
			double input = Circle.radiusValidator();
			
			Circle newCircle = new Circle(input);	
			
			String finalPrintCircum = Circle.getFormattedCircumference();
			
			System.out.printf(finalPrintCircum + "\n");
			
			String finalPrintArea = Circle.getFormattedArea();
			
			System.out.println(finalPrintArea);
		
		
		
		
		System.out.println("Would you you like to add another circle? (continue y/n) ");
		String cont = input2.nextLine();
		
		if(cont.equalsIgnoreCase("y")){
			addCircle = true;
			total++;
		}else{
			addCircle = false;
			System.out.println("Goodbye. You created " + total + " Circle objects(s).");
		}
		
		
		
	
	

		}
	}

}
