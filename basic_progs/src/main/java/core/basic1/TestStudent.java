package core.basic1;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
public class TestStudent {
	public static void main(String... args) {
		Resource rsc=new ClassPathResource("core\\basic1\\applicationContext.xml");
		BeanFactory bf=new XmlBeanFactory(rsc);
		Student st=(Student) bf.getBean("studentBean");
		System.out.println(st.toString());
	}
}
