package abstractfactory.product.productA;

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
