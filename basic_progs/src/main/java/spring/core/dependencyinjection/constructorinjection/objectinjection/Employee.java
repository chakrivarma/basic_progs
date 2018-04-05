package spring.core.dependencyinjection.constructorinjection.objectinjection;

import spring.core.dependencyinjection.constructorinjection.basic.Address;
import spring.core.dependencyinjection.setterinjection.Department;

public class Employee {
	String name;
	String empCode;
	Address address;
	Department department;
	/**
	 * @param name
	 * @param empCode
	 * @param address
	 * @param department
	 */
	public Employee(String name, String empCode, Address address, Department department) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
		this.department = department;
	}	
	
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the empCode
	 */
	public String getEmpCode() {
		return empCode;
	}
	/**
	 * @param empCode the empCode to set
	 */
	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the department
	 */
	public Department getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	public void setDepartment(Department department) {
		this.department = department;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", empCode=" + empCode + ", address=" + address + ", department=" + department
				+ "]";
	}	
	
}
