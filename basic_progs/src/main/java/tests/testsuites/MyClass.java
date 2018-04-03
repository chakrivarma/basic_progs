package tests.testsuites;
import org.json.JSONException;
import org.json.JSONObject;
public class MyClass {
	protected static String str[]=null;
	String msg="";
	public MyClass() {
		str=new String[]{"chaitanya","chakri","prabhakaran","rajesh"};
	}
	public MyClass(String str) {
		msg=str;
	}
	public String getMsg() {
		msg="gobithasan";
		return msg;
	}
	public static void main(String... args) {
		MyClass obj=new MyClass();
		System.out.println(obj.str.length);
	}
	public static String[] getArray() {
		return str;
	}
	public static JSONObject getJsonObject() throws JSONException {
		JSONObject json=new JSONObject();
		json.put("name","chaitanya varma");
		json.put("empid","AC017");
		json.put("gender","Male");
		json.put("Department","IT");
		return json;		
	}
}
