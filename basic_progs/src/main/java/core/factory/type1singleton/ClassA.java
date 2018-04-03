package core.factory.type1singleton;

public class ClassA{
	String name;
	private static final ClassA classA=new ClassA();
	private ClassA() {
		System.out.println("Classs A  instantialted");
	};
	public static ClassA getInstancer() {
		return classA;
	}
	public static ClassA getInstancer1() {
		return new ClassA();
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
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ClassA [name=" + name + ", getName()=" + getName() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
//	@Override
//	protected Object clone() {
//		return classA;
//	}
	
}

