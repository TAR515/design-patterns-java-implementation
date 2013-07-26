package main;

import singleton.Singleton;

/**
 * This class represents the entry point of the project.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class Main {

	/**
	 * Main function.
	 * @param args
	 */
	public static void main(String[] args) {
		// Getting the singleton instance at first time. In this case the singleton's constructor is called. 
		Singleton singletonInstance1 = Singleton.getInstance();
		singletonInstance1.print();

		// Getting another instance of the singleton. In this case the singleton's constructor isn't called.
		Singleton singletonInstance2 = Singleton.getInstance();
		singletonInstance2.print();
	}

}
