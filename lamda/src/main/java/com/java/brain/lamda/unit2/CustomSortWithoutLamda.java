package com.java.brain.lamda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomSortWithoutLamda {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Samip", "M", "07/09/1989"),
				new Person("Amiksha", "A", "07/10/1989"), new Person("Bumbra", "D", "24/10/1989"),
				new Person("Xerox", "Z", "04/10/1989"));

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});

		System.out.println("Sort by last name");
		CustomSortWithoutLamda.print(people);

		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getFirstName().compareTo(o2.getFirstName());
			}
		});
		System.out.println("Sort by First name");
		CustomSortWithoutLamda.print(people);
		
		System.out.println("Starts with S");
		printConditionally(people,(p)->p.getFirstName().startsWith("S"));

		System.out.println("Print firstName start with S");
		printFirstNameBeginingWithC(people);

	}

	private static void printConditionally(List<Person> people, Condition condition) {
		for (Person p : people) {
			if (condition.test(p)) {
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

	public static void printFirstNameBeginingWithC(List<Person> list) {
		for (Person p : list) {
			if (p.getFirstName().startsWith("S")) {
				System.out.println(p);
			}
		}
	}

}
