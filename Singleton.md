# Singleton (Bill Pugh solution) #

## Motivation ##

Singleton pattern is a design solution where an application wants to have one and only one instance of any class, in all possible scenarios without any exceptional condition. It has been debated long enough in java community regarding possible approaches to make any class singleton. Still, you will find people not satisfied with any solution you give. They can not be overruled either. In this post, we will discuss some good approaches and will work towards our best possible effort.

## Code ##

Singleton class:

```
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
```

Main class:

```
/**
	 * Main function.
	 * @param args
	 */
	public static void main(String[] args) {
		// Getting the singleton instance at first time. In this case the singleton's constructor is called. 
		Singleton singletonInstance1 = Singleton.getInstance();
		singletonInstance1.print();

		// Getting another instance of the singleton. In this case the singleton's constructor isn't called.
		Singleton singletonInstance2 = Singleton.getInstance();
		singletonInstance2.print();
	}
```

Output:

```
Singleton's constructor
Print method
Print method
```