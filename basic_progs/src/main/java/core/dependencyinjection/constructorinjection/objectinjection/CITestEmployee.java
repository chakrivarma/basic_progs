package core.dependencyinjection.constructorinjection.objectinjection;

import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class CITestEmployee {
	public static void main(String[] args) {
		Resource rsc=new ClassPathResource("core\\dependencyinjection\\constructorinjection\\objectinjection\\applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(rsc);
		Employee emp=(Employee)bf.getBean("employeeBeanCI");
		System.out.println(emp.toString());
	}
}
