package com.sample;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Onetomany {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		/*Transaction transaction =session.beginTransaction();
		
		
		
		Question q1=new Question();
		q1.setQid(301);
		q1.setQuestion("what is java");
		Answer a1=new Answer();
		a1.setAid(401);
		a1.setAnswer("html is language");
		
		Answer a2=new Answer();
		a2.setAid(402);
		a2.setAnswer("java is a oops language");
		
		
		Answer a3=new Answer();
		a3.setAid(403);
		a3.setAnswer("hibernate is orm tool");
		
		Answer a4=new Answer();
		a4.setAid(404);
		a4.setAnswer("java is platform independent");
		
		List<Answer> al1=new ArrayList<Answer>();
		al1.add(a4);
		al1.add(a2);
		
		q1.setAnswers(al1);
		
		a2.setQ(q1);
		a4.setQ(q1);
		
		session.save(q1);
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(a4);
		transaction.commit();*/
		// fetch the data
		// all the answers of a question
		Question qu1=(Question)session.get(Question.class,301);
		System.out.println(qu1.getQuestion());
		for(Answer an:qu1.getAnswers()) {
			System.out.println(an.getAnswer());
		}
		System.out.println("************************************");
		//fetch question based on answer
		Answer ans=(Answer)session.get(Answer.class,403);
		System.out.println(ans.getQ().getQuestion());
		System.out.println(ans.getAnswer());
		session.close();
		factory.close();
		

	}

}






