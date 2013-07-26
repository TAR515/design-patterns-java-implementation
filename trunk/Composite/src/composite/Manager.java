package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
