package spring.core.factory.type2otherobj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring\\core\\factory\\type2otherobj\\applicationContext.xml");
		ClassA cb=ac.getBean("classB",ClassA.class);
		cb.printA();
	}
}
