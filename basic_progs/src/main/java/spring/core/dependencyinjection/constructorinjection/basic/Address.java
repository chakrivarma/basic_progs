package spring.core.dependencyinjection.constructorinjection.basic;

public class Address {
	int doorno;
	String street;
	String landMark;
	String City;
	/**
	 * @param doorno
	 * @param street
	 * @param landMark
	 * @param city
	 */
	public Address(int doorno, String street, String landMark, String city) {
		super();
		this.doorno = doorno;
		this.street = street;
		this.landMark = landMark;
		City = city;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", landMark=" + landMark + ", City=" + City + "]";
	}
}
