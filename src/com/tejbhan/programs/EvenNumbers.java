package com.tejbhan.programs;

//Question 1

public class EvenNumbers {

	public static void main(String[] args) {
		
		int num[] = {23, 44, 56, 1, 0, 87, 69, 98, 66, 34};
		
		System.out.print("Even Numbers: ");
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0)
				System.out.print(" "+num[i]);
		}

	}

}
