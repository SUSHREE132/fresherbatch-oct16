package com.assignment;

import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scr = new Scanner(System.in);
		int a,b,c,res;
		System.out.println("Enter three value");
		a=scr.nextInt();
		b=scr.nextInt();
		c=scr.nextInt();
		res=a+b+c;
		
		if(res>=90) {
			System.out.println("Passed");
		}else if(res<=90 && res>=60){
			System.out.println("promoted");
		}else{
			System.out.println("Fail");
		}
	}

}
