package Controller;

import org.springframework.context.ApplicationContext;

import model.Collage;
import model.Student;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("student.xml");
	    Collage collage=context.getBean("clgObj1", Collage.class);
	    Map<Integer, Student> studDetails= collage.getStudents();
	    String clgName = collage.getCollageName();
	    for(Entry<Integer, Student> entry: studDetails.entrySet())
	    {
	    	System.out.println(entry.getKey()+" "+clgName+" "+entry.getValue());
	    }
	    
	    Collage clg= context.getBean("clgObj2",Collage.class);
	    Map<Integer, Student> studDet = clg.getStudents();
	    String collageName= clg.getCollageName();
	    for(Entry<Integer, Student> en:studDet.entrySet())
	    {
	    	
	    	//System.out.println(en.getKey()+" "+collageName+" "+en.getValue());
	    	System.out.println(en.getKey()+" "+collageName+" "+en.getValue());
	    }

	}

}
