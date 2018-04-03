package tests.testsuites;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;


public class TestCase1 {
	@Test
	public void arrayTestCaseMethod() {
		String[] str=new String[]{"chaitanya","chakri","prabhakaran","rajesh"};
		assertArrayEquals(new MyClass().getArray(),str);
	}
}
