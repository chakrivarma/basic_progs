package tests.testsuites;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.json.JSONException;
import org.json.JSONObject;
public class TestCase2 {

	@Test
	public void jsonTestCaseMethod() throws JSONException {
		JSONObject json=new JSONObject();
		json.put("name","chaitanya varma");
		json.put("empid","AC017");
		json.put("gender","Male");
		json.put("Department","IT");
		JSONObject json1=new JSONObject();
		json1.put("name","prabhakaran");
		json1.put("empid","AP065");
		json1.put("gender","Male");
		json1.put("Department","IT");
		System.out.println(json.toString());
		assertEquals(new MyClass().getJsonObject().toString(),json.toString());
	}
}
