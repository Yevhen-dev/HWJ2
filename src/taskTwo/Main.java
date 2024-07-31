package taskTwo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Input flat number: ");
		long flatNum = sc.nextLong();
		
		if( flatNum >= 1 && flatNum <= 36 ) {
				System.out.println( "Flat #" + flatNum + " is in a first hall and on a " + ( flatNum == 36 ? flatNum/4 : flatNum/4 + 1 ) + " floor");
		} else if( flatNum >= 37 && flatNum <= 72 ) {
			System.out.println( "Flat #" + flatNum + " is in a second hall and on a " + ( flatNum == 72 ? ( flatNum-36 )/4 : ( flatNum - 36 )/4 + 1 ) + " floor");
		} else if( flatNum >= 73 && flatNum <= 108 ) {
			System.out.println( "Flat #" + flatNum + " is in a third hall and on a " + ( flatNum == 108 ? ( flatNum - 72 )/4 : ( flatNum - 72 )/4 + 1 ) + " floor");
		} else if( flatNum >= 109 && flatNum <= 144 ) {
			System.out.println( "Flat #" + flatNum + " is in a fourth hall and on a " + ( flatNum == 144 ? (flatNum - 108)/4 : ( flatNum - 108 )/4 + 1 ) + " floor");
		} else {
			System.out.println("Type correct number");
		}

	}

}
