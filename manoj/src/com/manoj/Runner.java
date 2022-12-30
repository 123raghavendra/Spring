package com.manoj;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {
	public static void main(String[] args) {
		Student student = new Student(1, "manoj", "java");
		Student student1 = new Student(2, "sudeep", "python");

		Student student2 = new Student(3, "darshi", "x");

		Student student3 = new Student(4, "mala", "w");
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(student);
		list.add(student1);

		list.add(student2);

		list.add(student3);
		System.out.println(list);
	//	List<Student> list2 = list.stream().sorted().collect(Collectors.toList());
	//	System.out.println(list2);
	//	List<Student> collect = list.stream().sorted((n,m)->n.cource.compareTo(m.cource)).collect(Collectors.toList());
	//	System.out.println(collect);

	}

}
