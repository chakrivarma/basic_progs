package tests.basictest1;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestCase1 {
	String msg="hello varma";
	@Test
	public void TestCase1() {
		assertEquals("hello chakri",msg);
	}
}
