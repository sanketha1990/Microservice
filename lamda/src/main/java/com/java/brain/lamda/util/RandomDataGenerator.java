package com.java.brain.lamda.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import org.fluttercode.datafactory.impl.DataFactory;

import com.google.gson.Gson;

public class RandomDataGenerator {

	public static void main(String[] args) throws Exception {
		long start = System.currentTimeMillis();
		FileWriter file = new FileWriter(Constants.BASE_FOLDER + "persons.txt");

		BufferedWriter writer = new BufferedWriter(file);
		Gson gson = new Gson();

		IntStream.range(1, 1000).parallel().forEach(i -> {
			Person person = generatePersonData();

			try {
				writer.write(gson.toJson(person) + System.lineSeparator());
				writer.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		});

		System.out.println(TimeUnit.SECONDS.convert(System.currentTimeMillis() - start, TimeUnit.MILLISECONDS));
	}

	public static Person generatePersonData() {

		DataFactory factory = new DataFactory();

		Person person = new Person();

		person.setPrefix(factory.getPrefix(2));
		person.setSuffix(factory.getSuffix(3));
		person.setFirstName(factory.getFirstName());
		person.setLastName(factory.getLastName());
		person.setBirthDate(factory.getBirthDate());
		person.setCity(factory.getCity());
		person.setDoingBusinessAs(factory.getBusinessName());
		person.setEmail(factory.getEmailAddress());
		person.setAddressLine1(factory.getAddress());
		person.setAddressLine2(factory.getAddressLine2());

		return person;
	}

	public static List<Person> generatePersonData(long number) {

		List<Person> result = new ArrayList<>();

		LongStream.range(0, number).forEach(i -> {
			result.add(generatePersonData());
		});

		return result;
	}

}
