package taskFive;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input number ******:");
		String str = sc.next();
		
		if( str.length() != 6 ) {
			System.out.println( "Type correct number" );
		} else {
			int counter = 0;
			for( int i = 0; i < ( str.length() / 2 ); i++ ) {
				if( str.charAt(i) != str.charAt( str.length() - i - 1 ) ) {
					System.out.println( "Your number is not a palindrome" );
					break;
				} else {
					counter++;
				}
			}
			if( counter == 3 ) {
				System.out.println( "Your number is palindrome" );
			}
		}

	}

}
