# Abstract Factory #

## Description ##

The abstract factory pattern is a software creational design pattern first described in Design Patterns, the book. It provides a way to encapsulate a group of individual factories that have a common theme without specifying their concrete classes. In normal usage, the client software creates a concrete implementation of the abstract factory and then uses the generic interface of the factory to create the concrete objects that are part of the theme. The client does not know (or care) which concrete objects it gets from each of these internal factories, since it uses only the generic interfaces of their products. This pattern separates the details of implementation of a set of objects from their general usage and relies on object composition, as object creation is implemented in methods exposed in the factory interface.


## Structure Diagram ##

![![](https://design-patterns-java-implementation.googlecode.com/svn/img/abstractfactory/Abstract_factory_UML.png)](https://design-patterns-java-implementation.googlecode.com/svn/img/abstractfactory/Abstract_factory_UML.png)

## Code ##

Interface of the Abstract Factory:

```
/**
 * This is the interface of the Abstract Factory.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public interface AbstractWidgetFactory {
	
	/**
	 * Creates a Window widget.
	 * @return {@link Window}.
	 */
	public Window createWindow();

	/**
	 * Creates a Button widget.
	 * @return {@link Button}.
	 */
	public Button createButton();
}
```

A concrete implementation of the Abstract Factory:

```
/**
 * This class is the concrete factory of the MacOSXWidget.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class MacOSXWidgetFactory implements AbstractWidgetFactory {

	/**
	 * Title of the widget.
	 */
	private static final String TITLE = " MacOS";

	/**
	 * Creates a {@link MacOSXWindow} widget.
	 */
	@Override
	public Window createWindow() {
		return new MacOSXWindow(TITLE);
	}

	/**
	 * Creates a {@link MacOSXButton} widget.
	 */
	@Override
	public Button createButton() {
		return new MacOSXButton(TITLE);
	}

}
```

A product interface of the factory:

```
/**
 * Product interface of the window.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public interface Window {

	/**
	 * Set title of the window.
	 * 
	 * @param text
	 *            New window title.
	 */
	public void setTitle(String text);

	/**
	 * Repaint of the button.
	 */
	public void repaint();
}
```

A concrate product of the factory:

```
/**
 * MaxOsWindow is a concrete product of the window.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class MacOSXWindow implements Window {

	/**
	 * Window title.
	 */
	private String title = null;

	public MacOSXWindow(String title) {
		super();
		this.title = title;
	}

	/**
	 * @see #setTitle(String)
	 */
	@Override
	public void setTitle(String text) {
		this.title = text;
	}

	/**
	 * @see #setTitle(String)
	 */
	@Override
	public void repaint() {
		System.out.println("Repaintig window: " + this.title);
	}

}
```

In same model the project also contains a `button` product of the factory.

The main fuction:

```
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
```

Output:

```
Repaintig window:  MacOS
Repainting button:  MacOS
```