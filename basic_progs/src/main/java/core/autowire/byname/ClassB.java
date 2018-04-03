package core.autowire.byname;

public class ClassB {
	ClassA classA;
	/**
	 * 
	 */
	public ClassB() {
		super();
		System.out.println("ClassB instantiated");
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("ClassB display method called");
	}
	/**
	 * @return the classA
	 */
	public ClassA getClassA() {
		return classA;
	}
	/**
	 * @param classA the classA to set
	 */
	public void setClassA(ClassA classA) {
		this.classA = classA;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClassB [classA=" + classA + ", getClassA()=" + getClassA() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
}
