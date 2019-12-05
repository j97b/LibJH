package com.bae.library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private List<Person> people = new ArrayList<Person>();
	
	public Library() {
		super();
	}

	public List<Person> addPerson(Person person) {
		this.people.add(person);
		return people;
	}
	
	public boolean removePerson(Person person) {
		return this.people.remove(person);
	}

}
