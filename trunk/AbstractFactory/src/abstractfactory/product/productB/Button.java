package abstractfactory.product.productB;

/**
 * Product interface of the button.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public interface Button {

	/**
	 * Set title of the button.
	 * 
	 * @param text
	 *            New button title.
	 */
	public void setTitle(String text);

	/**
	 * Repaint of the button.
	 */
	public void repaint();
}
