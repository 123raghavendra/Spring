package com.xworkz.aptitude;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 1234;
		int temp=num;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		if(temp==rev) {
		System.out.println("is palindrome");
		}
		else {
			System.out.println("is not palindrome");
		}
	}
}
