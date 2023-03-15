package util;

import java.util.Scanner;

public class UseScanner {

	public static void main(String[] args) {

		// user input.
		int num ;
		Scanner sc =new Scanner(System.in);
		System.out.println("Please enter a number:");
		num = sc.nextInt();
		
		if(num %2==0) {
			System.out.println("this number is oven ");
		}else {
			System.out.println("this number is odd");
		}
	}

}
