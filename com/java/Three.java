package com.java;
import java.util.ArrayList;
import java.util.Arrays;



public class Three {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="A quick brown fox jumps over the lazy dog";
		
		ArrayList<String> arr=new ArrayList<>(Arrays.asList(s.split(" ")));
		System.out.println(arr);

	}

}
