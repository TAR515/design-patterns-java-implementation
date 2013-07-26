package singleton;

/**
 * Singleton class. This class represents all of the `Singleton` design pattern based on Bill Pugh solution.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class Singleton {

	/**
	 * Constructor
	 */
	private Singleton() {
		System.out.println("Singleton's constructor");
	}

	/**
	 * This class ensures that the {@link Singleton}'s class do not has more than one instance.
	 * 
	 * @author Turdean Arnold-Róbert
	 * @version 1.0
	 */
	private static class SingletonHolder {
		private final static Singleton	INSTANCE	= new Singleton();
	}

	/**
	 * Returns the {@link Singleton}'s instance.
	 * @return instance of the {@link Singleton}.
	 */
	public static Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/**
	 * A simple print method.
	 */
	public void print() {
		System.out.println("Print method");
	}
}
