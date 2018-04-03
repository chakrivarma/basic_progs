package tests.basictest1;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

import basictest.TestCase;

import org.junit.runner.Result;
public class TestRunner {
	public static void main(String args[]) {
		Result rs=JUnitCore.runClasses(TestCase2.class);
		System.out.println(rs.wasSuccessful());
		Result rs1=JUnitCore.runClasses(TestCase1.class);
		System.out.println(rs1.wasSuccessful());
		for(Failure fails:rs.getFailures()) {
			System.out.println(fails.getMessage());
		}
		for(Failure fails:rs1.getFailures()) {
			System.out.println(fails.getMessage());
		}
		Result rs2=JUnitCore.runClasses(TestCase1.class);
		System.out.println(rs2.getFailures());
	}
}
