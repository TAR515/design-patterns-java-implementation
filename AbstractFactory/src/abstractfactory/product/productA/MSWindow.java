package abstractfactory.product.productA;


/**
 * MSWindow is a concrete product of the window.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class MSWindow implements Window {

	/**
	 * Window title.
	 */
	private String title = null;

	public MSWindow(String title) {
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
