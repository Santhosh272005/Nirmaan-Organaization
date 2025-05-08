package day4;
import java.util.Scanner;
public class calculation {

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		
		System.out.println(" enter the 1st number :");
		int num1 = get.nextInt();
		System.out.println(" enter the 2nd number :");
		int num2 = get.nextInt();
		
		System.out.println("press 1 for ADD ");
		System.out.println("press 2 for SUB");
		System.out.println("press 3 for MUL");
		System.out.println("press 4 for MOD");
		System.out.println("press 5 for DIV");
		
		int key = get.nextInt();
		
		switch (key) {
		
		case 1 : {
			
			System.out.println("ADD" + (num1+num2));
			break;
		}
		case 2 : {
			
			System.out.println("SUB" + (num1-num2));
			break;
		}
		case 3 : {
	
			System.out.println("MUL" + (num1*num2));
			break;
		}
		case 4 : {
	
			System.out.println("MOD" + (num1%num2));
			break;
		}
		case 5 : {
			
			System.out.println("DIV" + (num1/num2));
			break;
		}

		default:
			System.out.print("CHECK THE KEY");
			break;
			
		}

	}

}
