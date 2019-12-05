package com.bae.library;

public class Person extends Entity {

	int age;
	String email;
	
	public Person() {
		super();
	}
	
	public Person(int id, String name, int age, String email) {
		super(id, name);
		this.age = age;
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
