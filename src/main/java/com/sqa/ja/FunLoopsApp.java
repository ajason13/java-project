/**
 * File Name: FunLoopsApp.java<br>
 * Alvarez, Jason<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 19, 2017
 */
package com.sqa.ja;

import java.util.*;

import com.sqa.ja.helpers.*;

/**
 * FunLoopsApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class FunLoopsApp {

	private static String appName = "Fundamental Loops";

	/**
	 * Write a method which prints the grade average for a user based on a user
	 * supplied set of grade values. Repeat execution until user has no more
	 * items to be graded. Use a do while for this exercise. You will also have
	 * to use two variables to hold the current accumulated grade points as well
	 * as the total number of grades entered so that the average will be
	 * totalGradePoints / numTotalGrades. Other things covered in this exercise:
	 * Scanner, Integer.parseInt.
	 */
	public static void calcGradeAverage() {
		Scanner scan = new Scanner(System.in);
		String cont = "";
		String gradePoint;
		int count = 0;
		int totalGradePoints = 0;
		do {
			System.out.print("What is the grade point? ");
			gradePoint = scan.nextLine();
			try {
				totalGradePoints += Integer.parseInt(gradePoint);
				count++;
			} catch (NumberFormatException e) {
				System.err.println("Not a valid grade point: " + e.getMessage());
			}
			System.out.print("Do you have another grade entry? (Y/N) ");
			cont = scan.nextLine();
		} while (cont.equals("Y") || cont.equals("y"));
		System.out.println(
				"Average Grade Points = " + totalGradePoints + "/" + count + " = " + (double) totalGradePoints / count);
		scan.close();
	}

	/**
	 * Write a Java program which prints all even number from 1 to 100, then all
	 * odd numbers between 300-400, and finally prints 30-333 with only numbers
	 * evenly divided by 3 . Use a while loop for this exercise. You will also
	 * want to use an if condition and use the % operator to check if a number %
	 * 2 is equal to 0 and print it if that is the case.
	 */
	public static void whileLoopExercise() {
		int i = 2;
		while (i <= 100) {
			System.out.print(i + " ");
			if (i % 50 == 0) {
				System.out.println();
			}
			i += 2;
		}
		System.out.println();
		i = 301;
		while (i <= 400) {
			System.out.print(i + " ");
			if (i % 349 == 0) {
				System.out.println();
			}
			i += 2;
		}
		System.out.print("\n\n");
		i = 30;
		while (i <= 333) {
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
			if (i % 90 == 0) {
				System.out.println();
			}
			i++;
		}
		System.out.print("\n\n");
	}

	/**
	 * Write a Java program which prints out a count from 1 to 100, than prints
	 * the numbers 200-100, and finally prints 10-1000 with only numbers evenly
	 * divided by 10. Use the for loop to do these and do not use the %
	 * operator.
	 */
	public static void doForLoopsExercise() {
		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " ");
			if (i % 20 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		for (int i = 200; i >= 100; i--) {
			System.out.print(i + " ");
			if (i % 20 == 0 && i != 200) {
				System.out.println();
			}
		}
		System.out.println();
		for (int i = 10; i <= 1000; i += 10) {
			System.out.print(i + " ");
			if (i % 200 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		doForLoopsExercise();
		whileLoopExercise();
		calcGradeAverage();
		AppBasics.farewellUser(name);
	}
}
