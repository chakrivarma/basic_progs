package core.factory.type1singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactory {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("core\\factory\\type1singleton\\applicationContext.xml");
		ClassA classA=context.getBean("classA",ClassA.class);
		classA.setName("chaitanya");
		ClassA classA1=context.getBean("classA",ClassA.class);
		classA1.setName("madiraju");
		
		ClassA classA2=context.getBean("classB",ClassA.class);
		classA2.setName("varma");
		
		
		ClassA classA3=context.getBean("classB",ClassA.class);
		classA3.setName("chakri");
		System.out.println(classA.toString());
		System.out.println(classA1.toString());
		System.out.println(classA2.toString());
		System.out.println(classA3.toString());
		
		
	}
	
}
