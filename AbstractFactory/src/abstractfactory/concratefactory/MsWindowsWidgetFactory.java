package abstractfactory.concratefactory;

import abstractfactory.AbstractWidgetFactory;
import abstractfactory.product.productA.MSWindow;
import abstractfactory.product.productA.Window;
import abstractfactory.product.productB.Button;
import abstractfactory.product.productB.MSButton;

/**
 * This class is the concrete factory of the MsWindowsWidget.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class MsWindowsWidgetFactory implements AbstractWidgetFactory {

	/**
	 * Title of the widget.
	 */
	private static final String TITLE = " MsWindows";
	
	/**
	 * Creates a {@link MSWindow} widget.
	 */
	@Override
	public Window createWindow() {
		return  new MSWindow(TITLE);
	}

	/**
	 * Creates a {@link MSButton} widget.
	 */
	@Override
	public Button createButton() {
		return new MSButton(TITLE);
	}

}
