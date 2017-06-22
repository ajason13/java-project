/**
 * File Name: MoreLoopingApp.java<br>
 * Alvarez, Jason<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 21, 2017
 */
package com.sqa.ja;

import java.util.*;

import com.sqa.ja.helpers.*;

/**
 * MoreLoopingApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Alvarez, Jason
 * @version 1.0.0
 * @since 1.0
 */
public class MoreLoopingApp {

	public static String appName = "MoreLoopingApp";

	/**
	 *
	 */
	public static void Loop1() {
		for (int i = 10; i > 5; i--) {
			System.out.print(i + ",");
		}
		System.out.println("5");
		for (int i = 0; i <= 5; i++) {
			System.out.print("[" + i + "]");
		}
		System.out.println();
		for (int i = 1000; i >= 40; i /= 5) {
			System.out.print(i + "<<<");
		}
		System.out.println("8");
		for (int i = 9999; i >= 1111; i /= 3) {
			System.out.print("{{{{-" + i);
		}
		System.out.println("\n");
	}

	/**
	 *
	 */
	public static void Loop2() {
		for (int i = 0; i < 6; i++) {
			for (int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}

	/**
	 *
	 */
	public static void Loop3() {
		for (int i = 0; i < 6; i++) {
			for (int k = 6; k > i; k--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void Loop4() {
		Scanner scan = new Scanner(System.in);
		boolean cont = true;
		while (cont) {
			System.out.print("What do you want to do? ");
			String response = scan.nextLine();
			System.out.println(response);
			if (response.equals("exit")) {
				cont = false;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		Loop1();
		Loop2();
		Loop3();
		Loop4();
		AppBasics.farewellUser(name);
	}
}
