package spring.core.dependencyinjection.constructorinjection.basic;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
//import org.springframework.core.io.XmlClassPathResource;
public class TestAddress {
	public static void main(String args[]) {
		Resource rsc=new ClassPathResource("spring\\core\\dependencyinjection\\constructorinjection\\basic\\applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(rsc);
		Address address=(Address)bf.getBean("addressBean");
		System.out.println(address.toString());
	}
}
