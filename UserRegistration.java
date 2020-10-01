package com.practice.regexproblem;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstName = sc.nextLine();
		String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
		if (Pattern.matches(pattern, firstName)) {
			System.out.println("Valid first name");
			System.out.println("\nEnter your last name: ");
			String lastName = sc.nextLine();
			if (Pattern.matches(pattern, lastName)) {
				System.out.println("Valid  last name");
			} else {
				System.out.println("Invalid last name!!!...Try again");
			}
			System.out.println("\nUser name is " + firstName + " " + lastName);
		} else {
			System.out.println("Invalid first name!!!...Try again");
			do {
				System.out.println("Enter your first name: ");
				firstName = sc.nextLine();
			} while (!Pattern.matches(pattern, firstName));

			System.out.println("\nEnter your last name: ");
			String lastName = sc.nextLine();
			if (Pattern.matches(pattern, lastName)) {
				System.out.println("Valid last name");
			} else {
				System.out.println("Invalid last name!!!...Try again");
				do {
					System.out.println("Enter your last name: ");
					lastName = sc.nextLine();
				} while (!Pattern.matches(pattern, lastName));
				System.out.println("Valid  last name");
				System.out.println("\nUser name is " + firstName + " " + lastName);
				sc.close();
			}
		}
	}
}
