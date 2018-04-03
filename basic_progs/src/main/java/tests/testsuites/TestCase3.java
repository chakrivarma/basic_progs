package tests.testsuites;
import org.junit.Test;
import org.junit.Assert;
public class TestCase3 {
	@Test
	public void constructorTestMethod() {
		MyClass obj=new MyClass("hello tester");
		String msg=obj.getMsg();
		Assert.assertEquals("gobithasan",msg);
	}
}
