package Controller;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.Developer;

public class TestEmpApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("emp.xml");
		Developer dev=context.getBean("devObj",Developer.class);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp id");
		int id=sc.nextInt();
		System.out.println("Enter Emp name");
		String name=sc.next();
		System.out.println("Enter Emp phone");
		long phone=sc.nextLong();
		System.out.println("Enter project name");
		String ProName=sc.next();
		System.out.println("Enter project Location");
		String locName=sc.next();
		
		dev.setEmpId(id);
		dev.setEmpName(name);
		dev.setEmpPhone(phone);
		dev.setProjectName(ProName);
		dev.setProjectLocation(locName);
		
		System.out.println(dev.getEmpId()+" "+dev.getEmpName()+" "
		+dev.getEmpPhone()+" "+dev.getProjectName()+" "+dev.getProjectLocation());

	}

}
