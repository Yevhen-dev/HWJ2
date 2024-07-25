package taskSix;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type x:");
		double x = sc.nextDouble();
		
		System.out.println("Type y:");
		double y = sc.nextDouble();
		
		if ( Math.pow(x, 2) + Math.pow(y, 2) <= Math.pow(4, 2) ) {
			System.out.println( "The dote with coorditat x = " + x + " and y = " + y + " is inside circle" );
		} else {
			System.out.println( "The dote with coorditat x = " + x + " and y = " + y + " is not exist circle" );
		}
		
	}

}
