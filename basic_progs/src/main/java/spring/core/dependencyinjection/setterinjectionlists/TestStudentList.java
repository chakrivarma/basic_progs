package spring.core.dependencyinjection.setterinjectionlists;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestStudentList {
	/**
	 * @param args
	 */
	public static void main(String args[]) {
//		ApplicationContext context=new ClassPathXmlApplicationContext("core\\dependencyinjection\\setterinjectionlists\\applicationContext.xml");
//		Student stu=(Student)context.getBean("studentBean");
		
		Resource rsc=new ClassPathResource("spring\\\\core\\\\dependencyinjection\\\\setterinjectionlists\\\\applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(rsc);
		Student stu=(Student)bf.getBean("studentBean");
		
		System.out.println(stu);
	}
}
