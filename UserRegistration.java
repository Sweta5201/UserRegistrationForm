package com.practice.regexproblem;

import java.util.*;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first name: ");
                String firstName = sc.nextLine();
                String pattern = "[A-Z]{1}[a-zA-Z]{2,}";
                if(Pattern.matches(pattern, firstName))
        	     System.out.println("Valid first name");
               else 
        	     System.out.println("Invalid first name!!!...Try again");
               sc.close();
	}

}
