package tests.basictest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestRunner {
	public static void main(String args[]) {
		Result rs=JUnitCore.runClasses(TestCase.class);
		for(Failure fails:rs.getFailures()){
			System.out.println(fails.getMessage());
		}
		System.out.println(rs.wasSuccessful());
	}
}
