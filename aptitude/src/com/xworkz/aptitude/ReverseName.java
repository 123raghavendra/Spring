package com.xworkz.aptitude;

import java.util.Scanner;

public class ReverseName {
	
	
	public static void main(String[] args) {
 
		String name;  
		Scanner sc=new Scanner(System.in);  
		System.out.print("Enter a String: ");  
		name=sc.nextLine();                    //reading string from user  
		System.out.print("After reverse string is: ");  
		for(int i=name.length();i>0;--i)                //i is the length of the string  
		{  
		System.out.print(name.charAt(i-1));            //printing the character at index i-1  
		}  
		}  
		
	}
	


