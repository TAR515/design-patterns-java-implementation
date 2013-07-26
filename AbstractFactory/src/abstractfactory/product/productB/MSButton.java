package abstractfactory.product.productB;

/**
 * MSButton is a concrete product of the button.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class MSButton implements Button {

	/**
	 * Button title.
	 */
	private String title = null;

	public MSButton(String title) {
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
	 * @see #repaint()
	 */
	@Override
	public void repaint() {
		System.out.println("Repainting button: " + this.title);
	}

}
