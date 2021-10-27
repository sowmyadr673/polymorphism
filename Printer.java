package com.xworkz.polymorphism;

public class Printer {

	public Printer() {
		System.out.println("Inside printer");
	}

	public void print() {
		System.out.println("Inside print method");
		System.out.println("print the document in default setting");
	}

	public void print(String size) {
		System.out.println("Inside print method");
		System.out.println("print the document based on the size" + size);
	}

	public void print(int startindex, int lastindex) {
		System.out.println("Inside print method");
		System.out.println("print the document from " + startindex + " to " + lastindex);
	}
}