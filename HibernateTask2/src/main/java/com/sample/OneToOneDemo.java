package com.sample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDemo {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
	/*	Transaction transaction =session.beginTransaction();
		Person p1=new Person();
		p1.setPid(1001);
		p1.setPname("rohit");
		
		BloodGroup b1=new BloodGroup();
		b1.setBgid(1);
		b1.setBgname("A+");
		
		p1.setBg(b1);
		
		Person p2=new Person();
		p2.setPid(1003);
		p2.setPname("rajesh");
		
		BloodGroup b2=new BloodGroup();
		b2.setBgid(3);
		b2.setBgname("A-");
		
		p2.setBg(b2);
		
		session.save(p1);
		session.save(p2);
		session.save(b1);
		session.save(b2);
		transaction.commit();*/
		
		//fetch the data
		Person per1=(Person)session.get(Person.class, 1001);
		System.out.println(per1.getPname());
		System.out.println(per1.getBg().getBgname());
		session.close();
		factory.close();
		

	}

}