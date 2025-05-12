package javaEx;

import java.util.Scanner;

public class operation {
	
	
		public static void main(String[] args) {
			Scanner get = new Scanner(System.in);
			System.out.println("Enter the first number");
			int num1 = get.nextInt();
			System.out.println("Enter the second number");
			int num2 = get.nextInt();
			
			System.out.println("Choose the operation:"); 
			System.out.println("1 for Arithmatic operatoins");
			System.out.println("2 for Relational operatoins");
			System.out.println("3 for Logical operatoins");
			System.out.println("4 for Unary operatoins");
			System.out.println("5 for Conditional operatoins");
	        System.out.println("6 for Assignment operatoins");
			
			
			int key = get.nextInt();
			
			
			switch (key) {
			case 1: {
				
				System.out.println("Arithmatic operations");
	            System.out.println("Addition : " + (num1 + num2));
	            System.out.println("Subtraction : " + (num1 - num2));
	            System.out.println("Multiplication : " + (num1 * num2));
	            System.out.println("Division : " + (num1 / num2));
	            System.out.println("Modulus : " + (num1 % num2));
				break;
			}
			
			case 2: {
				
				System.out.println("Relational operations");
	            System.out.println(  (num1 < num2));
	            System.out.println( (num1 > num2));
	            System.out.println( (num1 <= num2));
	            System.out.println( (num1 >= num2));
	            System.out.println((num1 == num2));
	            System.out.println((num1 != num2));
				break;
			}
			
			case 3: {

			    System.out.println("xLogical operations");
	            System.out.println("Need 2 more values to perform this operation");
	            System.out.println("Enter num 3");
			    int num3 = get.nextInt();
	            System.out.println("Enter num 4");
	            int num4 = get.nextInt();
	            System.out.println(num1 > num3 && num2 < num4);
	            System.out.println(num1 < num3 || num2 > num4);
	            
				break;
			}
			
			case 4: { 
				
				System.out.println("Unary operations"); 
	            System.out.println("Need initial values to perform this operation");  
	            System.out.println("Enter initial value");
	            int value1 = get.nextInt();     
	            System.out.println("After increment: " + (++value1));
	            --value1;
	            System.out.println("After decrement: " +  (--value1));

				break;
			}
			
			case 5: {
				
				System.out.println("Conditional operations");
	            System.out.println("Enter the  value");
	            int value2 = get.nextInt(); 
	            if (value2 % 2 ==0){
	                System.out.println(value2 +" is even");
	            }
	            else{
	                System.out.println(value2 +" is odd");
	            }
				break;
			}
	         
	        case 6: {
				
				System.out.println("Assignment operations");
	            System.out.println("Need initial values to perform this operation");  
	            System.out.println("Enter initial value");
	            int value3 = get.nextInt(); 
	            System.out.println("After += :" +(value3+=num1));
	            System.out.println("After -= :" +(value3-=num1));
	            System.out.println("After *= :" +(value3*=num1)); 
	            System.out.println("After /= :" +(value3/=num1));
	            System.out.println("After %= :" +(value3%=num1));
				break;
			}
			
			default:
				System.out.println("Unexpected value: " + key);
				
			}
				
		}
	

}





