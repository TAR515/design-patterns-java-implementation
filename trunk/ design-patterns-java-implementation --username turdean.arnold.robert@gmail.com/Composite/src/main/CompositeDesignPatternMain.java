package main;

import composite.Developer;
import composite.Employee;
import composite.Manager;

/**
 * This class represents the entry point of the project
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class CompositeDesignPatternMain {
	
	/**
	 * Main function.
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating two developers.
		Employee developer1 = new Developer("John", 10000);
		Employee developer2 = new Developer("David", 15000);

		// Creating a manager and adding two developers under his control. 
		Employee manager1 = new Manager("Daniel", 25000);
		manager1.add(developer1);
		manager1.add(developer2);

		// Creating a 3'th developer.
		Employee developer3 = new Developer("Michael", 20000);

		// Creating the general manager and adding a developer and a manager under his control.
		Employee generalManager = new Manager("Mark", 50000);
		generalManager.add(developer3);
		generalManager.add(manager1);
		
		// Printing the general manager's informations.
		generalManager.print();
	}
}
