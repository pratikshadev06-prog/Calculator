package calculatorApplication;

import java.util.Scanner;

public class UserInput {
	
	
	    Scanner sc = new Scanner(System.in);

	    public int getChoice() {
	        System.out.println("1. Add");
	        System.out.println("2. Subtract");
	        System.out.println("3. Multiply");
	        System.out.println("4. Divide");

	        System.out.print("Choose operation: ");
	        return sc.nextInt();
	    }

	    public double getFirstNumber() {
	        System.out.print("Enter first number: ");
	        return sc.nextDouble();
	    }

	    public double getSecondNumber() {
	        System.out.print("Enter second number: ");
	        return sc.nextDouble();
	    }
	}



