package com.web.java;

import java.util.Scanner;

public class CalculateRatio_11 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the numerator");
		int numerator=sc.nextInt();
		System.out.println("enter the denomenator");
		int denomenator=sc.nextInt();
		int ratio = 0;
		if(denomenator!=0)
		{
			 ratio=numerator/denomenator;
		}
		System.out.println("the ratio of two numbers="+ratio);

	}

}
