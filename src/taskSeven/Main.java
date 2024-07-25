package taskSeven;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Type x:");
		double x = sc.nextDouble();
		
		System.out.println("Type y:");
		double y = sc.nextDouble();
		
		double ax = Math.sqrt( Math.pow( x - 0, 2 ) + Math.pow( y - 0 , 2 ) ); 
		double ab = Math.sqrt( Math.pow( 4 - 0, 2 ) + Math.pow( 4 - 0 , 2 ) ); 
		double bx = Math.sqrt( Math.pow( x - 4, 2 ) + Math.pow( y - 4 , 2 ) ); 
		double bc = Math.sqrt( Math.pow( 6 - 4, 2 ) + Math.pow( 1 - 4 , 2 ) ); 
		double cx = Math.sqrt( Math.pow( x - 6, 2 ) + Math.pow( y - 1 , 2 ) ); 
		double ca = Math.sqrt( Math.pow( 0 - 6, 2 ) + Math.pow( 0 - 1 , 2 ) ); 
		
		double pabx =  ( ax + ab + bx ) / 2;
		double pbcx = ( bx + bc + cx ) / 2;
		double pcax = ( cx + ca + ax ) / 2;
		double pabc = ( ab + bc + ca ) / 2;
		
		
		double sFirst = Math.sqrt(pabx * (pabx - ax) * ( pabx - ab ) * (pabx - bx) );
		double sSecond = Math.sqrt(pbcx * (pbcx - bx) * ( pbcx - bc ) * (pbcx - cx) );
		double sThird = Math.sqrt(pcax * (pcax - cx) * ( pcax - ca ) * (pcax - ax) );
		double sMain = Math.sqrt(pabc * (pabc - ab) * ( pabc - bc ) * (pabc - ca) );
		
		boolean result = ( sMain == sFirst + sSecond + sThird );
		
		
		System.out.println( "The dote with coorditat x = " + x + " and y = " + y + " is inside triangle: " + result);

	}

}
