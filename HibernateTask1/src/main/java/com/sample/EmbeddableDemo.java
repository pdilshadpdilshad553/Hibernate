package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
	/*Student st1=	new Student(1001, "ragu", 8907653345L);
	Course c1=new Course(2001, "hibernatel", "10days");
	st1.setCourse(c1);
	
	Student st2=	new Student(1002, "ramu", 8907645345L);
	Course c2=new Course(2002, "springboot", "15days");
	st2.setCourse(c2);
	
	
	
		
		session.save(st1);
		session.save(st2);
	
		
		Transaction transaction=session.beginTransaction();
		transaction.commit();*/
		
		
		//fetching the data
		Student s1=(Student)session.get(Student.class, 1001);
		System.out.println(s1.getStid());
		System.out.println(s1.getStname());
		System.out.println(s1.getStcontact());
		System.out.println(s1.getCourse().getCid());
		System.out.println(s1.getCourse().getCname());
		System.out.println(s1.getCourse().getCduration());
		
		
		session.close();
		factory.close();
		
		
	
		
		

	}

}
