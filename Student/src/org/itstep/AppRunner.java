package org.itstep;

public class AppRunner {

	public static void main(String[] args) {
		StudentData studentData =new StudentData("Andrey", "Sokolov");
		System.out.println("Your first name " + studentData.getFirstName());
		System.out.println("Your second name " + studentData.getSecondName());
	}

}
