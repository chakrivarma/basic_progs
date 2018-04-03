package tests.testcases;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestRun {
	public static void main(String[] args) {
		Result rs=JUnitCore.runClasses(TestCaseTest.class);
		for(Failure fail:rs.getFailures()) {
			System.out.println(fail.getMessage().toString());
		}
		System.out.println(rs.wasSuccessful());
	}
}
