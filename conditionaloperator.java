package javaEx;

public class conditionaloperator {

	public static void main(String[] args) {
		
		 //even or Odd
		
		
		
		int num = 9;
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("Number is: " + type);


	//MaxValue

	        int a = 15, b = 20;
	        int max = (a > b) ? a : b;
	        System.out.println("Maximum value is: " + max);
	    }
	}

