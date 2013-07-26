package abstractfactory;

import abstractfactory.product.productA.Window;
import abstractfactory.product.productB.Button;

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
