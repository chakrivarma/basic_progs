 package tests.test3;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertFalse;
public class TestJunit {
	@Test
	public void TestJunit() {
		int num=5;
		String temp=null;
		String str="test 1 2 3";
		assertEquals("test 1 2 3",str);
		assertFalse(num>2);
		assertNotNull(str);
	}
}
