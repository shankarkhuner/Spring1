package Controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import model.Customer;



public class CustomerApp {
	public static void main(String[] args) {
		//Resource resource=new ClassPathResource("Customerinfo.xml");
		 // Resource resource=new ClassPathResource("Customerinfo.xml");
		
		 // BeanFactory factory = new XmlBeanFactory(resource);

        Resource resource = new ClassPathResource("Customerinfo.xml");
        BeanFactory factory = new XmlBeanFactory(resource);
		
		 
		  ApplicationContext context = new ClassPathXmlApplicationContext("Customerinfo.xml");
		//Object getBean(String besnName)
		Customer customer1=(Customer) factory.getBean("CustomerObj1");
		 // Customer customer1=(Customer) context.getBean("CustomerObj1");
		customer1.setCustomerId(100);
		customer1.setCustomerName("A");
		customer1.setCustomerphone(985087645L);
		System.out.println(customer1);
		
		Customer customer2=(Customer) factory.getBean("CustomerObj2");
		//Customer customer2=(Customer) context.getBean("CustomerObj1");
		customer2.setCustomerId(108);
		customer2.setCustomerName("B");
		customer2.setCustomerphone(888669822L);
	   System.out.println(customer2);

	}
}



