package com.sqa.ja;

import java.util.*;

import com.sqa.ja.helpers.*;

/**
 * JavaFunApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class JavaFunApp {

	private static Scanner scan = new Scanner(System.in);

	private static String name;

	private static String appName = "Java Fundamentals";

	/**
	 *
	 *
	 */
	public static void main(String[] args) {
		name = AppBasics.greetUserAndGetName(appName);
		System.out.println();
		compareValueTo10(5);
		compareValueTo10(15);
		compareValueTo10(10);
		compareValueTo10(-10);
		System.out.println();
		evalMonth();
		System.out.println();
		evalGradeLetter();
		System.out.println();
		scan.close();
		AppBasics.farewellUser(name);
	}

	/**
	 * Write a function which takes a int parameter and print the message on
	 * screen that “number is greater than 10” otherwise it should print “number
	 * is smaller than 10” (Can you support if parameter is equal to 10)
	 */
	private static void compareValueTo10(int num) {
		if (num > 10) {
			System.out.println(num + " is greater than 10.");
		} else if (num < 10) {
			System.out.println(num + " is less than 10.");
		} else {
			System.out.println(num + " equals to 10");
		}
	}

	/**
	 * Write a program that can ask the user for a grade value and print the
	 * associated grade letter.
	 */
	private static void evalGradeLetter() {
		System.out.println("Please supply grade value: ");
		String gradeNum = scan.nextLine();
		int num = Integer.parseInt(gradeNum);
		if (num >= 80 && num <= 100) {
			System.out.println("A");
		} else if (num >= 70 && num < 80) {
			System.out.println("B");
		} else if (num >= 60 && num < 70) {
			System.out.println("C");
		} else if (num >= 50 && num < 60) {
			System.out.println("D");
		} else if (num >= 0 && num < 50) {
			System.out.println("F");
		} else {
			System.out.println("Not a valid grade value");
		}
	}

	/**
	 * Write a program that prints the name of month using switch statement
	 * given a number from the user. *You will need to use the
	 * Integer.parseInt() method to convert a user supplied string to a number
	 * type variable that can be evaluated.
	 */
	private static void evalMonth() {
		System.out.print("Please supply number for month: ");
		String monthNum = scan.nextLine();
		int num = Integer.parseInt(monthNum);
		switch (num) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Feburary");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("August");
			break;
		case 9:
			System.out.println("September");
			break;
		case 10:
			System.out.println("October");
			break;
		case 11:
			System.out.println("November");
			break;
		case 12:
			System.out.println("December");
			break;
		default:
			System.out.println("Invalid number");
			break;
		}
	}
}
