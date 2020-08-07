package com.java.brain.lamda.util;

import java.util.Date;

public class Person {

	private String firstName;

	private String lastName;

	private String prefix;

	private String addressLine1;

	private String addressLine2;

	private String suffix;

	private String city;

	private String email;

	private String doingBusinessAs;

	private Date birthDate;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDoingBusinessAs() {
		return doingBusinessAs;
	}

	public void setDoingBusinessAs(String doingBusinessAs) {
		this.doingBusinessAs = doingBusinessAs;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [firstName = ");
		builder.append(firstName);
		builder.append(", lastName = ");
		builder.append(lastName);
		builder.append(", prefix = ");
		builder.append(prefix);
		builder.append(", addressLine1 = ");
		builder.append(addressLine1);
		builder.append(", addressLine2 = ");
		builder.append(addressLine2);
		builder.append(", suffix = ");
		builder.append(suffix);
		builder.append(", city = ");
		builder.append(city);
		builder.append(", email = ");
		builder.append(email);
		builder.append(", doingBusinessAs = ");
		builder.append(doingBusinessAs);
		builder.append(", birthDate = ");
		builder.append(birthDate);
		builder.append("]");
		return builder.toString();
	}

}
