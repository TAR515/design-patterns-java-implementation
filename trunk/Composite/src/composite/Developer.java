package composite;

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
