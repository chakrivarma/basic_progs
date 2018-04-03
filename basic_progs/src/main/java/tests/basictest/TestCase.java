package tests.basictest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestCase {
	@Test
	public void testCase() {
		String str="hello junit";
		assertEquals("hello junit",str);
	}
}
