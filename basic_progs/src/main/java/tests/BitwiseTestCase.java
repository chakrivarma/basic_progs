package tests;
import org.junit.Test;
import junit.framework.TestCase;
import org.junit.Before;

import org.junit.After;
import static org.junit.Assert.assertEquals;
public class BitwiseTestCase{
	int a,b,c,d;
	@Before
	public void beforeTest() {
		System.out.println("Test case Intialized");
		a=42;b=14;c=1;d=64;
	}
	@Test
	public void bitwiseAnd() {
		progs.operators.Bitwise obj=new progs.operators.Bitwise(46, 32, 1, 64);
		String[] args= {"test","hello"};
		obj.main(args);
		assertEquals(obj.getAndOperation(a,b),10);
		assertEquals(obj.getOrOperation(a, b),46);
		assertEquals(obj.getAndNotOperation(a, b),32);
		assertEquals(obj.getExOrOperation(a, b),36);
		assertEquals(obj.getRShiftOperation(d),16);
		assertEquals(obj.getLShiftOperation(c),4);
	}
	@After
	public void AfterTest() {
		System.out.println("Test case stopped");
	}
	public void tearDown() {
		System.out.println("Test done");
	}
}
