package com.practice.regexproblem;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {

	public static boolean validateEmailId(String email) {
		if (Pattern.matches("^[a-zA-Z0-9]+[_+-.]{0,1}[a-zA-Z0-9]+@[a-zA-Z0-9]+[.]{1}[a-z]{2,}([.]{0,1}[a-z]{2,}){0,1}$",
				email)) {
			return true;
		} else {
			return false;
		}
	}

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
			}

		}
		System.out.println("\nEnter your email ids: ");
		String[] sampleIds = new String[] { "abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com",
				"abc-100@abc.net", "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com", "abc",
				"abc@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com", ".abc@abc.com", "abc()*@gmail.com",
				"abc@%*.com", "abc..2002@gmail.com", "abc.@gmail.com", "abc@abc@gmail.com", "abc@gmail.com.1a",
				"abc@gmail.com.aa.au" };
		for (String pos : sampleIds) {
			System.out.println(pos + ": " + validateEmailId(pos));
		}

		String mobilePat = "[0-9]{2}[' ']{1}[789]{1}[0-9]{9}";
		System.out.println("\nEnter your mobile number with country code: ");
		String mobileNumber = sc.nextLine();
		if (Pattern.matches(mobilePat, mobileNumber)) {
			System.out.println("Valid mobile number");
			System.out.println("User mobile number is " + mobileNumber);
		} else {
			do {
				System.out.println("Invalid mobile number!!!...Try again");
				System.out.println("\nEnter your mobile number: ");
				mobileNumber = sc.nextLine();
			} while (!Pattern.matches(mobilePat, mobileNumber));
			System.out.println("Valid mobile number");
			System.out.println("\nUser mobile number is " + mobileNumber);
		}
		String passPat = "^(?=.{8,}$)(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9]*[@#$%^*!&][0-9a-zA-Z]*";
		System.out.println("\nEnter your password: ");
		String password = sc.nextLine();
		if (Pattern.matches(passPat, password)) {
			System.out.println("Valid password");
			System.out.println("User password is " + password);
		} else {
			do {
				System.out.println("Invalid password!!!...Try again");
				System.out.println("\nEnter your password: ");
				password = sc.nextLine();
			} while (!Pattern.matches(passPat, password));
			System.out.println("Valid password");
			System.out.println("\nUser password is " + password);
		}
		sc.close();
	}
}
