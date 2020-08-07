package com.java.brain.lamda.unit3;

public class MethodReference1 {

	public static void main(String[] args) {
		Thread thread = new Thread(() -> System.out.println("Hello reference!"));
		thread.start();
		
		Thread t=new Thread(MethodReference1::printMessage); // short cut for () -> System.out.println("Hello reference!")
		t.start();
		
	}
	private static void printMessage() {
		System.out.println("Inside MethodReference");
	}

}
