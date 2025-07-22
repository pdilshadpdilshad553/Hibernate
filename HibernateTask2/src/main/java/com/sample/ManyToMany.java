package com.sample;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToMany {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
//		Transaction transaction =session.beginTransaction();
//		Developer d1=new Developer();
//		d1.setDid(101);
//		d1.setDname("ram");
//		
//		
//		Developer d2=new Developer();
//		d2.setDid(102);
//		d2.setDname("laxman");
//		
//		List<Developer> dList=new ArrayList<Developer>();
//		dList.add(d1);
//		dList.add(d2);
//		
//		Project p1=new Project();
//		p1.setPid(201);
//		p1.setPname("ecommerce");
//		
//
//		Project p2=new Project();
//		p2.setPid(202);
//		p2.setPname("banking");
//
//		Project p3=new Project();
//		p3.setPid(203);
//		p3.setPname("website");
//
//		Project p4=new Project();
//		p4.setPid(204);
//		p4.setPname("mobile");
//		
//		List<Project> pList=new ArrayList<Project>();
//		pList.add(p1);
//		pList.add(p2);
//		pList.add(p3);
//		pList.add(p4);
//		
//		
//		d1.setProjects(pList);
//		d1.setProjects(pList);
//		
//		p1.setDevelopers(dList);
//		p2.setDevelopers(dList);
//		p3.setDevelopers(dList);
//		p4.setDevelopers(dList);
//		
//		session.save(d1);
//		session.save(d2);
//		session.save(p1);
//		session.save(p2);
//		session.save(p3);
//		session.save(p4);
//		
//		transaction.commit();
		//fetch project list for a developer
		Developer de1=(Developer)session.get(Developer.class, 102);
		
		System.out.println(de1.getDname());
		for(Project p:de1.getProjects()) {
			System.out.println(p.getPname());
		}
		//fetch developers list based on project
		Project pr1=(Project)session.get(Project.class, 204);
		System.out.println(pr1.getPname());
		for(Developer d:pr1.getDevelopers()) {
			System.out.println(d.getDname());
		}
		session.close();
		factory.close();
		
	}

}
