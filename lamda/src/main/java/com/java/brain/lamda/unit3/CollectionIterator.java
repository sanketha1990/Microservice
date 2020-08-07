package com.java.brain.lamda.unit3;

import java.util.Arrays;
import java.util.List;

import com.java.brain.lamda.unit2.Person;

public class CollectionIterator {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Samip", "M", "07/09/1989"),
				new Person("Amiksha", "A", "07/10/1989"), new Person("Bumbra", "D", "24/10/1989"),
				new Person("Xerox", "Z", "04/10/1989"));
		
		//for, While, Do while are external iterator
		
		//1.8 has Internal iterator for each 
		people.forEach(p ->System.out.println(p));
		System.out.println("");
		people.forEach(System.out::println);

	}

}
