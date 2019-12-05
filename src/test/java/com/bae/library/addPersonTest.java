package com.bae.library;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.bae.library.Person;

public class addPersonTest {

	@Test
	public void addPersonTest() {
		Library lib = new Library();
		Person person = new Person(1, "Kevin", 30, "bigkev@kevin.com");
		List<Person> testList = new ArrayList<Person>();
		testList.add(person);
		Assert.assertEquals(testList, lib.addPerson(person));
	}

}
