package tests.basictest2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
	String message="Hello World";
	MessageUtil messageutil=new MessageUtil(message);
	@Test
	public void testMethod() {
		assertEquals(message,messageutil.printMessage());
	}
}
