package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class Five {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        List<String> Names=new ArrayList<>();
        Names.add("Subrat");
        Names.add("Saroj");
        Names.add("Krishna");
        Names.add("Kedar");
        Names.add("Pravin");

        StringBuilder result=new StringBuilder();
        Names.forEach(s ->result.append(s.charAt(0)));
        System.out.println(result+" ");
        
    

	}

}
