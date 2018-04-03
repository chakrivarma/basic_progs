package tests.testresults;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestRun {
	public static void main(String[] args) {
		Result res=JUnitCore.runClasses(TestResultTest.class);
		for (Failure failure : res.getFailures()) {
			System.out.println(failure.toString());
		}		
		System.out.println(res.wasSuccessful());
	}
}
