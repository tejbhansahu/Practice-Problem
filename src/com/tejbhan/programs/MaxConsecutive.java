package com.tejbhan.programs;

import java.util.Scanner;

//Question 2

public class MaxConsecutive {
	
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int len, counter = 0, helper = 0;
		
		System.out.println("Enter the Length of Array");
		len = s.nextInt();
		
		int arr[] = new int[len];
		
		System.out.println("Enter the elements of an array containing 0's and 1's");
		
		for(int i = 0; i < len; i++)
			arr[i] = s.nextInt();
		
		for(int i = 0 ; i < len; i++) {
			if(arr[i] == 1) {
				counter++;
				helper = (helper > counter) ? helper : counter;
			} else counter = 0;
		}
		
		System.out.println("Max num of consecutive 1's is: " + helper);
		
	}

}
