package com.java;
interface Simpleinterest{
	int solve(int p,int r,int t);
}

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Simpleinterest a=(p,r,t)->p*r*t;
		System.out.println("The multiplication of three numbers is: "+a.solve(2,3,4));

	}

}
