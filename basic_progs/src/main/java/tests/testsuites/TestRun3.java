package tests.testsuites;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRun3 {
	public static void main(String[] args) {
		Result res=JUnitCore.runClasses(TestRun3.class);
		for(Failure fail:res.getFailures()) {
			System.out.println("message="+fail.getMessage().toString()+"--Description="+fail.getDescription());
		}
		System.out.println("test case pass="+res.wasSuccessful());
	}
}
