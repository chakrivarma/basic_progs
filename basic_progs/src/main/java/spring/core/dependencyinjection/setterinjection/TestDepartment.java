package spring.core.dependencyinjection.setterinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.beans.factory.xml.XmlBeanFactory;

public class TestDepartment {
	public static void main(String args[]) {
		Resource rsc=new ClassPathResource("spring\\core\\dependencyinjection\\setterinjection\\applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(rsc);
		Department dept=(Department) bf.getBean("departmentBean");
		System.out.println(dept.toString());
	}
}
