package com.assignment3;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/*
 * a UserLoginApplication Class,
   which houses the "public static void main" method.
   In the event that there's an invalid login attempt, 
   the user should only be given 5 chances in total to login
*/

public class UserLoginApplication {
	private static UserService userService = new UserService();

	public static void main(String[] args) throws IOException {
		userService.populateArray();
		Scanner scanner = new Scanner(System.in);
		
		try {
			int attempts = 0;
			boolean isValid = false;
			
			while(!isValid && attempts < 5) {
				System.out.println("Please enter your email:");
				String username = scanner.nextLine();
				System.out.println("Please enter your password : ");
				String password = scanner.nextLine();
				UserPOJO current = new UserPOJO();
				current = userService.validate(username,password);
				if(current != null) { 
					System.out.println("Welcome: " + current.getName());
					isValid = true;
				}
				else {
					attempts++;
					if(attempts < 5) {
						System.out.println("Invalid login, please try again.");
					} 
					else if(attempts == 5) {
						System.out.println("Too many failed login attempts, you are now locked out.");
					}
				}
				
			}
		} finally {
			 if(scanner != null) {
				 scanner.close();
			 }
		}
		
		
	}
	


}
