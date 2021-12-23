package java.com;

import java.util.Scanner;

public class WhileLoops {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();

		System.out.println("The given number is  " + a);

		if (a % 2 == 0) {

			System.out.println(a + ": is even number");
		}

		else {

			System.out.println(a + ": is odd number");

		}

	}

}
