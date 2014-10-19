package org.demo.examlpeGit;

public class Main {
	
	public static void main(String[] args) {
		SalesData data = new SalesData();
		
		data.display();
		displayGreeting();
	}
	
	private static void displayGreeting(){
		System.out.println("Hello Mehdi !");
		System.out.println("This app demo");
	}
}
