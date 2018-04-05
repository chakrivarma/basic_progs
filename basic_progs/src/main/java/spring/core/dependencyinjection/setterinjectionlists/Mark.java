package spring.core.dependencyinjection.setterinjectionlists;

public class Mark {
	String subjectName;
	int marks;
	/**
	 * @return the subjectName
	 */
	
	public String getSubjectName() {
		return subjectName;
	}
	/**
	 * @param subjectName
	 * @param marks
	 */
	public Mark(String subjectName, int marks) {
		super();
		this.subjectName = subjectName;
		this.marks = marks;
	}
	
	
	/**
	 * 
	 */
	public Mark() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mark [subjectName=" + subjectName + ", marks=" + marks + "]";
	}
	
	
}
