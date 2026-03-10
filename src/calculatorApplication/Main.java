package calculatorApplication;

public class Main {
	
	

	    public static void main(String[] args) {

	        Calculator calc = new Calculator();
	        UserInput input = new UserInput();

	        int choice = input.getChoice();
	        double num1 = input.getFirstNumber();
	        double num2 = input.getSecondNumber();

	        double result = 0;

	        switch (choice) {

	            case 1:
	                result = calc.add(num1, num2);
	                break;

	            case 2:
	                result = calc.subtract(num1, num2);
	                break;

	            case 3:
	                result = calc.multiply(num1, num2);
	                break;

	            case 4:
	                result = calc.divide(num1, num2);
	                break;

	            default:
	                System.out.println("Invalid choice");
	                return;
	        }

	        System.out.println("Result: " + result);
	    }
	}



