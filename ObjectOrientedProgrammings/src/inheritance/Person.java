package inheritance;

import java.lang.*;

public  class Person extends Object { // IS A Relationship

	private String name;
	private String designation;

	public Person() {
		super(); // Object();

		System.out.println("Person() called...");

	}

	public Person(String name, String designation) {
		super();
		this.name = name;
		this.designation = designation;
	}

	public   Object  learn() {  // service

		System.out.println("Person Learning..");
		
		return  null;

	}

	public void walk() {  // service

		System.out.println("Walking...");

	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", designation=" + designation + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
