# Composite #

## Motivation ##

When dealing with Tree-structured data, programmers often have to discriminate between a leaf-node and a branch. This makes code more complex, and therefore, error prone. The solution is an interface that allows treating complex and primitive objects uniformly. In object-oriented programming, a composite is an object designed as a composition of one-or-more similar objects, all exhibiting similar functionality. This is known as a "has-a" relationship between objects. The key concept is that you can manipulate a single instance of the object just as you would manipulate a group of them. The operations you can perform on all the composite objects often have a least common denominator relationship. For example, if defining a system to portray grouped shapes on a screen, it would be useful to define resizing a group of shapes to have the same effect (in some sense) as resizing a single shape.


## Structure Diagram ##

![![](https://design-patterns-java-implementation.googlecode.com/svn/img/composite/Composite.png)](https://design-patterns-java-implementation.googlecode.com/svn/img/composite/Composite.png)

## Code & Example of usage ##

Interface of the employee:

```
/**
 * This is the interface of the Composite.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public interface Employee {

	/**
	 * Adds a new employee to the current employee.
	 * 
	 * @param employee
	 *            New employee.
	 */
	public void add(Employee employee);

	/**
	 * Removes the given employee from the current employee.
	 * 
	 * @param employee
	 *            Removable employee.
	 */
	public void remove(Employee employee);

	/**
	 * Get the required child of the current employee.
	 * 
	 * @param i
	 *            Index of the child.
	 * @return {@link Employee}
	 */
	public Employee getChild(int i);

	/**
	 * Get name of the current employee.
	 * 
	 * @return Name of the current employee.
	 */
	public String getName();

	/**
	 * Get salary of the current employee.
	 * 
	 * @return Salary of the current employee.
	 */
	public double getSalary();

	/**
	 * Prints the current employee's informations.
	 */
	public void print();
}
```

Developer:

```
/**
 * This class represents a developer. A developer can't control any other employees.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class Developer implements Employee {

	/**
	 * Name of the manager.
	 */
	private String name;

	/**
	 * Manager's salary.
	 */
	private double salary;

	public Developer(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	/**
	 * @see #getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * @see #getSalary()
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @see #print()
	 */
	public void print() {
		System.out.println("-------------");
		System.out.println("Name =" + getName() + " Salary =" + getSalary());
		System.out.println("-------------");
	}

	@Deprecated
	public void add(Employee employee) {
		// this is leaf node so this method is not applicable to this class.
	}

	@Deprecated
	public void remove(Employee employee) {
		// this is leaf node so this method is not applicable to this class.
	}

	@Deprecated
	public Employee getChild(int i) {
		// this is leaf node so this method is not applicable to this class.
		return null;
	}
}
```

Manager:

```
/**
 * This class represents a manager. A manager could have more {@link Developer}s or another
 * {@link Manager}s under his control.
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class Manager implements Employee {

	/**
	 * Name of the manager.
	 */
	private String name;

	/**
	 * Manager's salary.
	 */
	private double salary;

	/**
	 * Developers or managers under the control of the current manager.
	 */
	private List<Employee> employees = new ArrayList<Employee>();

	public Manager(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	/**
	 * @see #getName()
	 */
	public String getName() {
		return name;
	}

	/**
	 * @see #getSalary()
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @see #print()
	 */
	public void print() {
		System.out.println("-------------");
		System.out.println("MANAGER - Name =" + getName() + " Salary =" + getSalary());
		System.out.println("-------------");

		// Printing all controlled employees.
		Iterator<Employee> employeeIterator = employees.iterator();
		while (employeeIterator.hasNext()) {
			Employee employee = employeeIterator.next();
			employee.print();
		}
	}

	/**
	 * @see #add(Employee)
	 */
	public void add(Employee employee) {
		employees.add(employee);
	}

	/**
	 * @see #remove(Employee)
	 */
	public void remove(Employee employee) {
		employees.remove(employee);
	}

	/**
	 * @see #getChild(int)
	 */
	public Employee getChild(int i) {
		return employees.get(i);
	}
}
```

MAIN class:

```
/**
 * This class represents the entry point of the project
 * 
 * @author Turdean Arnold-Róbert
 * @version 1.0
 */
public class CompositeDesignPatternMain {
	
	/**
	 * Main function.
	 * @param args
	 */
	public static void main(String[] args) {
		// Creating two developers.
		Employee developer1 = new Developer("John", 10000);
		Employee developer2 = new Developer("David", 15000);

		// Creating a manager and adding two developers under his control. 
		Employee manager1 = new Manager("Daniel", 25000);
		manager1.add(developer1);
		manager1.add(developer2);

		// Creating a 3'th developer.
		Employee developer3 = new Developer("Michael", 20000);

		// Creating the general manager and adding a developer and a manager under his control.
		Employee generalManager = new Manager("Mark", 50000);
		generalManager.add(developer3);
		generalManager.add(manager1);
		
		// Printing the general manager's informations.
		generalManager.print();
	}
}
```

Output:

```
-------------
MANAGER - Name =Mark Salary =50000.0
-------------
-------------
Name =Michael Salary =20000.0
-------------
-------------
MANAGER - Name =Daniel Salary =25000.0
-------------
-------------
Name =John Salary =10000.0
-------------
-------------
Name =David Salary =15000.0
-------------
```