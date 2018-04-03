package core.factory.type1singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class checkSingleton {
	public static void main(String... args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		ClassA obj=ClassA.getInstancer();
		obj.setName("chakri");
		System.out.println(obj.toString());
		ClassA obj1=ClassA.getInstancer();
		System.out.println(obj1.toString());
		Object obj2=(Object)ClassA.getInstancer();
		System.out.println(obj.hashCode()+"=="+obj1.hashCode());
		
		/**
		 breaking singleton by reflection
		 */
//		Method[] ms=obj.getClass().getMethods();
//		System.out.println(ms.length);
//		ClassA ca=null;
//		for(Method con:ms) {
//			con.setAccessible(true);
//			System.out.println(con.getName());		
//		}		
//		Constructor[] cons=obj.getClass().getDeclaredConstructors();
//		System.out.println(cons.length);
//		for(Constructor con:cons) {
//			con.setAccessible(true);
//			ca=(ClassA)con.newInstance();
//		}
//		ca.setName("tester");
//		System.out.println(obj.hashCode()+"=="+obj1.hashCode()+"=="+ca.hashCode());
//		System.out.println(ca.toString());
	}
}
