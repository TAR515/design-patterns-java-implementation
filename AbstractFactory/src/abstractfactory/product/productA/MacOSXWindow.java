package abstractfactory.product.productA;

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
