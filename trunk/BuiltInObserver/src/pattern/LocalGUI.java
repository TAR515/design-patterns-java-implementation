package pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * This object is an observer of the {@link Data} object.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class LocalGUI implements Observer {

	private Data data = null;

	@Override
	public void update(Observable o, Object arg) {
		data = (Data) o;

		System.out.println("Argument: " + arg);
		System.out.println("New data (Internet): " + this.data.getData());
	}
}
