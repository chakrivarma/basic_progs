package tests.basictest1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestCase2 {
	String str="JUnit test case";
	@Test
	public void TestCase() {
		assertEquals("JUnit test case",str);
	}
}
