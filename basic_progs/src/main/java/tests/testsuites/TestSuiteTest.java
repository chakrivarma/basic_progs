package tests.testsuites;
import junit.framework.TestSuite;
import junit.framework.TestResult;
public class TestSuiteTest {
	public static void main(String[] args) {
		TestSuite ts=new TestSuite(TestCase1.class,TestCase2.class,TestCase3.class);
		TestResult tr=new TestResult();
		ts.run(tr);
		int tsCount=tr.runCount();
		int errCount=tr.errorCount();
		System.out.println("total number of test cases="+tsCount);
		System.out.println("total number of errors="+errCount);
	}
}

