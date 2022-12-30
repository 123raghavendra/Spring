package com.xworkz.aptitude;

public class ReverseName1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String string="Raghavendra";
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(string);
		stringBuilder=stringBuilder.reverse();
		System.out.println(stringBuilder);

	}

}
