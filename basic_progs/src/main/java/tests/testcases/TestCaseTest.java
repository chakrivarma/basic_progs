package tests.testcases;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;
public class TestCaseTest extends TestCase {
	double value1,value2;
	@Before
	public void setup() {
		value1=2.0;
		value2=3.0;
	}
	@Test
	public void testeR() {
		System.out.println("total test cases="+this.countTestCases());
		System.out.println("test case name="+this.getName());
		this.setName("new name");
		System.out.println("new test case name="+this.getName());
	}
	public void tearDown() {
		System.out.println("tear down method");
	}
}
