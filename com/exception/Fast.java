package com.exception;

import java.util.Scanner;

public class Fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        try {
		            int a = 30, b = 0;
		            int c = a/b;  // cannot divide by zero
		            System.out.println ("Result = " + c);
		        }
		        catch(ArithmeticException e) {
		            System.out.println ("Can't divide a number by 0");
		        }
		    }
		}