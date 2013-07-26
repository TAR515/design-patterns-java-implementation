package abstractfactory.concratefactory;

import abstractfactory.AbstractWidgetFactory;
import abstractfactory.product.productA.MacOSXWindow;
import abstractfactory.product.productA.Window;
import abstractfactory.product.productB.Button;
import abstractfactory.product.productB.MacOSXButton;

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
