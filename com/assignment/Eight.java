package com.assignment;

import java.util.Arrays;

public class Eight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int intArray[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        System.out.println("Original array: " + Arrays.toString(intArray));
        int n = intArray.length;
       
        for (int i = 0; i< n-1; i++)
            for (int j = 0; j < n-i-1; j++)
           
                if (intArray[j]< intArray[j+1])  {
                    int temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            
        System.out.println("Sorted array: " + Arrays.toString(intArray));

	}

}
