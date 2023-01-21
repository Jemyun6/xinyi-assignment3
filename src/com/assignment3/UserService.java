package com.assignment3;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *  UserService class that will help with things like validating 
	if the inputted username/password matches what's in our UserPOJO Array.
	It should also provide the service of 
	reading the data from the file and creating the UserPOJO Array
*/

public class UserService { 

	public static UserPOJO[] users = new UserPOJO[4];
 
	UserPOJO validate(String userName, String password) {
		for(UserPOJO user : UserService.users) {
			if(user.getUsername().equalsIgnoreCase(userName) &&
					user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
		
	}
	
	void populateArray() throws FileNotFoundException, IOException { 
		
		BufferedReader reader = null; 
		String file = "data.txt";
		
		try { 
			String line;
			 reader = new BufferedReader(new FileReader(file));
			int i = 0;
			while((line = reader.readLine()) != null) { 
				users[i] = new UserPOJO(line.split(","));
				i++;
			}
			
		} finally {
			if(reader != null) {
				reader.close();
			}
			
		}
	}

}
