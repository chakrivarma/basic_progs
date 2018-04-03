package core.autowire.byname;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings("deprecation")
public class TestAutowireByName {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("core\\autowire\\byname\\applicationContext.xml");
		ClassB cb=context.getBean("classB",ClassB.class);
//		Resource rsc=new ClassPathResource("core\\autowire\\byname\\applicationContext.xml");
//		BeanFactory bf=new XmlBeanFactory(rsc);
//		ClassB cb=bf.getBean("classB", ClassB.class);
		cb.display();
		cb.getClassA().display();
	}
}
