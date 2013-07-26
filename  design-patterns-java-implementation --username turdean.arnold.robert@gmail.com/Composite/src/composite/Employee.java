package composite;

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