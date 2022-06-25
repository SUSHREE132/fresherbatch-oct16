package com.assignment;

import java.util.Scanner;

public class Fast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scr.nextInt();
		int rem=0,ans=0,temp=0;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			ans=ans+rem*rem*rem;
			n=n/10;
		}
		if(ans==temp) {
		System.out.println("Armstrong number");
		}else {
			System.out.println("Not a Armstrong number");
		}
	}

}
