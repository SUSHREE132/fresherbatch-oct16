package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class Four {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> Names=new ArrayList<>();
        Names.add("Subrat");
        Names.add("Saroj");
        Names.add("Krishna");
        Names.add("Kedar");
        Names.add("Pravin");
        
        
        Names.removeIf(s ->(s.length())%2!=0);

        for (String n : Names) {
            System.out.println(n);
        }


	}}
