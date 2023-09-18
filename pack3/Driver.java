package pack3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import pack1.EmpDAO;
import pack2.EmployeeConfig;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new AnnotationConfigApplicationContext(EmployeeConfig.class);
	EmpDAO empDAO=context.getBean("empDAO",EmpDAO.class);
	System.out.println(empDAO);
		 
		
	}

}
