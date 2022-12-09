package com.xworkz.test;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {

		String name;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the name ");
		name = scan.nextLine();
		System.out.print("After reverse string is: ");
		for (int i = name.length(); i > 0; --i) {
			System.out.print(name.charAt(i - 1));
		}
	}

}
