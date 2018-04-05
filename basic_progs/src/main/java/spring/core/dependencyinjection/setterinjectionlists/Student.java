package spring.core.dependencyinjection.setterinjectionlists;

import java.util.List;
import java.util.Map;

import javax.security.auth.Subject;

public class Student {
	String studentId;
	String studentName;
	List<Mark> marks;
	List<String> subjects;
	Map<String,Mark> subMarks;
	/**
	 * @return the studentId
	 */
	public String getStudentId() {
		return studentId;
	}
	/**
	 * @param studentId the studentId to set
	 */
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the marks
	 */
	public List<Mark> getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(List<Mark> marks) {
		this.marks = marks;
	}
	
	/**
	 * @return the subjects
	 */
	public List<String> getSubjects() {
		return subjects;
	}
	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	
	/**
	 * @return the subMarks
	 */
	public Map<String, Mark> getSubMarks() {
		return subMarks;
	}
	/**
	 * @param subMarks the subMarks to set
	 */
	public void setSubMarks(Map<String, Mark> subMarks) {
		this.subMarks = subMarks;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", marks=" + marks + ", subjects="
				+ subjects + ", subMarks=" + subMarks + "]";
	}
	
}
