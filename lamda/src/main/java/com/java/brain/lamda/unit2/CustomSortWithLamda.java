package com.java.brain.lamda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class CustomSortWithLamda {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Samip", "M", "07/09/1989"),
				new Person("Amiksha", "A", "07/10/1989"), new Person("Bumbra", "D", "24/10/1989"),
				new Person("Xerox", "Z", "04/10/1989"));

		//Collections.sort(people,(Person p1,Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		Collections.sort(people,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));
		System.out.println("Sort by last name");
		CustomSortWithLamda.print(people);
		
		System.out.println("Starts with S");
		printConditionally(people,(p)->p.getFirstName().startsWith("S"));
		System.out.println("=======================");

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate) {
		for (Person p : people) {
			if (predicate.test(p)) {
				System.out.println(p);
			}
		}
	}

	public static void print(List<Person> list) {
		for (Person p : list) {
			System.out.println(p);
		}
	}

	interface Condition {
		public boolean test(Person p);
	}

}
