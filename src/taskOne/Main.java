package taskOne;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Input first number: ");
		double firstNum = sc.nextDouble();
		
		System.out.println("Input second number: ");
		double secondNum = sc.nextDouble();
		
		System.out.println("Input third number: ");
		double thirdNum = sc.nextDouble();
		
		System.out.println("Input fourth number: ");
		double fourthNum = sc.nextDouble();
		
		if( firstNum > secondNum && firstNum > thirdNum && firstNum > fourthNum ) {
			System.out.println("Bigest number is : " + firstNum);
		} else if( secondNum > thirdNum && secondNum > fourthNum ) {
			System.out.println("Bigest number is : " + secondNum);
		} else if ( thirdNum > fourthNum ) {
			System.out.println("Bigest number is : " + thirdNum);
		} else if(firstNum == secondNum && secondNum == thirdNum && thirdNum == fourthNum) {
			System.out.println("All number are equal" + firstNum);
		}else {
			System.out.println("Bigest number is : " + fourthNum);
		}
		
	}

}
