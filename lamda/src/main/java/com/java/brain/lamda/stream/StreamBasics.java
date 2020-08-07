package com.java.brain.lamda.stream;

import java.util.List;
import java.util.concurrent.TimeUnit;

import com.java.brain.lamda.util.Person;
import com.java.brain.lamda.util.RandomDataGenerator;

public class StreamBasics {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		List<Person> people = RandomDataGenerator.generatePersonData(10000000);

		people.stream().filter(p -> p.getFirstName().startsWith("Craig")).filter(p -> p.getLastName().startsWith("T"))
				.forEach(p -> System.out.println(p));
		System.out.println(
				"Time taken = " + TimeUnit.SECONDS.convert(System.currentTimeMillis() - start, TimeUnit.MILLISECONDS));

		System.out.println("======================================");
		long start2 = System.currentTimeMillis();
		long count = people.stream().filter(p -> p.getFirstName().startsWith("Craig"))
				.filter(p -> p.getLastName().startsWith("T")).count();
		System.out.println("Count = " + count);
		System.out.println(
				"Time taken = " + TimeUnit.SECONDS.convert(System.currentTimeMillis() - start2, TimeUnit.MILLISECONDS));
		// Parllel streaming
		long count2 = people.parallelStream().filter(p -> p.getFirstName().startsWith("Craig"))
				.filter(p -> p.getLastName().startsWith("T")).count();
		System.out.println("Count = " + count2);
	}

}
