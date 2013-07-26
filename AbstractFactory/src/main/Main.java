package main;

import abstractfactory.AbstractWidgetFactory;
import abstractfactory.concratefactory.MacOSXWidgetFactory;
import abstractfactory.product.productA.Window;
import abstractfactory.product.productB.Button;

/**
 * Main class of the project.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class Main {

	/**
	 * Main function.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating a MacOSWidget.
		AbstractWidgetFactory widgetFactory = new MacOSXWidgetFactory();

		// Getting the concrete windows and button from the factory.
		Window window = widgetFactory.createWindow();
		Button button = widgetFactory.createButton();

		// Repaints the window and the button.
		window.repaint();
		button.repaint();
	}

}
