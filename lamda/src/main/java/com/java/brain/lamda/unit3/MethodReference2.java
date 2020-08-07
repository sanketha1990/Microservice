package com.java.brain.lamda.unit3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.java.brain.lamda.unit2.Person;

public class MethodReference2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("Samip", "M", "07/09/1989"),
				new Person("Amiksha", "A", "07/10/1989"), new Person("Bumbra", "D", "24/10/1989"),
				new Person("Xerox", "Z", "04/10/1989"));
		System.out.println("Starts with S");
		printConditionally(people, p->p.getFirstName().startsWith("S"),System.out::println);
		System.out.println("=========Print all==========");
		printConditionally(people, p->true,System.out::println);
		System.out.println("=======================");

	}

	private static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if (predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
