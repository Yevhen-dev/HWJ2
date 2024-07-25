package taskFour;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type your lucky number");
		int luckyNum = sc.nextInt();
		
		if(luckyNum < 1000 || luckyNum > 9999) {
			System.out.println("Sorry. Type other number");
		} else {
			String str = Integer.toString(luckyNum);
			
			char first = str.charAt(0);
			char second = str.charAt(1);
			char third = str.charAt(2);
			char fourth = str.charAt(3);
			int leftHalfSum = Character.getNumericValue(first) + Character.getNumericValue(second);
			int rightHalfSum = Character.getNumericValue(third) + Character.getNumericValue(fourth);
			
			if( leftHalfSum == rightHalfSum ) {
				System.out.println("Happy days!!!You have lucky ticket");
			} else {
				System.out.println("Sorry!Try other ticket");
			}
			
		}

	}


}
