package tests.testresults;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;
import junit.framework.AssertionFailedError;
import junit.framework.TestResult;
public class TestResultTest extends TestResult{

	public synchronized void addError(Test test,Throwable t) {
		super.addError((junit.framework.Test) test, t);
	}
	
	public synchronized void addFailure(Test test,AssertionFailedError afe) {
		super.addFailure((junit.framework.Test) test,afe);
	}
	@Test
	public void testResultCheck() {
		boolean bool=false;
		assertEquals("hello","hello");
		assertTrue(bool);
	}
}
