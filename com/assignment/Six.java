package com.assignment;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String username;
		String password;
		int i=0;
		 for( i=0;i<3;) {
			 System.out.println("Enter user name");
			 username = sc.next();
			System.out.println("Enter Password");
			 password = sc.next();
			 
			 if(username.length()<4 || password.length()>6) {
				 
				 System.out.println("Invalid Credential");
				 i++;
			 }
			 else {
			 System.out.println("Welcome");
			 break;
			 }
		 }
		 if(i==3) {
		 System.out.println("Contact Admin");
		 }
	}
}

