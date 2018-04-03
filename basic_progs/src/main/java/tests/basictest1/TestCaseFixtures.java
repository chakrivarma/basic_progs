package tests.basictest1;
import junit.framework.TestCase;
public class TestCaseFixtures extends TestCase {
	protected void setUp() {
		System.out.println("test fixture setup");
	}
	protected void tearDown() {
		System.out.println("Tear down the test case");
	}
}
