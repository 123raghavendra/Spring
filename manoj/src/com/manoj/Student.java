package com.manoj;

public class Student implements Comparable<Student> {
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", cource=" + cource + "]";
	}

	int id;

	public Student(int id, String name, String cource) {
		super();
		this.id = id;
		this.name = name;
		this.cource = cource;
	}

	String name;
	String cource;

	@Override
	public int compareTo(Student o) {
		String name = this.name;
		String name1= o.name;
		// TODO Auto-generated method stub
		return name.compareTo(name1);
	}


}
