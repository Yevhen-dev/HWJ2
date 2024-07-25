package taskThree;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input A side of triangle length: ");
		double aSide = sc.nextDouble();
		
		System.out.println("Input B side of triangle length: ");
		double bSide = sc.nextDouble();
		
		System.out.println("Input C side of triangle length: ");
		double cSide = sc.nextDouble();
		
		if( aSide + bSide > cSide || aSide + cSide > bSide || bSide + cSide > aSide ) {
			System.out.println("Triangle is exist");
		} else if( aSide == 0 || bSide == 0 || cSide == 0 ) {
			System.out.println("The side of triangle can`t be equal to 0 or less");
		}else {
			System.out.println( "Triangle with sides:" + aSide + ", " + bSide + ", " + cSide + " is not exist " );
		}

	}

}
