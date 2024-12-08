//
// Copyright (c) 2023 Promineo Tech
// Author:  Promineo Tech Academic Team
// Subject:  Variables & Operations Lab
// Java Week 01 Lab  
//
package week01;

public class Week01VariablesAndOperationsLab {

	public static void main(String[] args) {

		// 1. Create a variable to hold the quantity of 
		//		available plane seats left on a flight		

		int seatsOnPlane = 35;
		// 2. Create a variable to hold the cost of groceries at checkout

		double costOfGroceries = 225.34;
		// 3. Create a variable to hold a person's middle initial

		char middleInitial = 'A';
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isColdOutside = true;
		
		// 5. Create a variable to hold a customer's first name

		string firstName = "Cheryl";
		// 6. Create a variable to hold a street address
		
		string streetAddress = "2 Heritage Circle";
		// 7. Print all variables to the console
		
		
		// 8. A customer booked 2 plane seats, 
		//		remove 2 seats from the available seats variable
		seatsOnPlane = seatsOnPlane - 2;

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceries = costOfGroceries + 2.15;
		

		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		middleInitial = "M";

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isColdOutside = false;

		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		string fullName = firstName + " " + middleInitial + ". " + "Jennerjohn";

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable

		
		
	}
}
