package com.java.brain.lamda.unit1;

public class WithAndWithoutLamdaTest {

	public static void main(String[] args) {
		//1.7 without lamda
		WithAndWithoutLamdaTest test = new WithAndWithoutLamdaTest();
		test.print();

		//1.8 with lamda
		Runnable run = () -> System.out.println("Hello World!");
		run.run();
		
		//1.8 with lamda
		int a=10;
		int b=20;
		CustomFunctionInterfaceCalculate cfi1= (x,y) -> x*y;
		System.out.println(cfi1.calculate(a, b));
		
		CustomFunctionInterfaceCalculate cfi2= (x,y) -> x+y;
		System.out.println(cfi2.calculate(a, b));
		
		CustomFunctionInterfaceCalculate cfi3= (x,y) -> x-y;
		System.out.println(cfi3.calculate(a, b));
		
		CustomFunctionInterfaceCalculate cfi4= (x,y) -> x/y;
		System.out.println(cfi4.calculate(a, b));
		
		CustomFunctionInterfaceSize cfis=(x)->x.length();
		System.out.println("length of string "+cfis.length("test"));
		
	}
	
	public void print() {
		System.out.println("Hello world!");
	}

}
