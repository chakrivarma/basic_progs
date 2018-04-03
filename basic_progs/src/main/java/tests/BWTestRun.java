package tests;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.util.List;
public class BWTestRun {
	public static void main(String args[]) {
		Result rs=JUnitCore.runClasses(BitwiseTestCase.class);
		List<Failure> fails=rs.getFailures();
		for(Failure f:fails) {
			System.out.println(f.getMessage());
		}
		System.out.println("Test case success="+rs.wasSuccessful());
	}
}
