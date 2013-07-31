package pattern;

import java.util.Observable;

/**
 * This object contains some data, if the data changes then this object notifies the observers.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class Data extends Observable {

	/**
	 * Data
	 */
	private String data = null;

	public Data(String data) {
		this.setData(data);
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;

		// Notify the observers.
		notifyObservers(data);
	}

	@Override
	public void notifyObservers() {
		setChanged();
		super.notifyObservers();
	}

	@Override
	public void notifyObservers(Object arg) {
		setChanged();
		super.notifyObservers(arg);
	}

}
