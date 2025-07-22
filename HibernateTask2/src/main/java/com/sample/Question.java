package com.sample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;



@Entity

public class Question {
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<Answer> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}
	@Id
	private int qid;
	private String question;
	@OneToMany
	private List<Answer>answers;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int qid, String question, List<Answer> answers) {
		super();
		this.qid = qid;
		this.question = question;
		this.answers = answers;
	}
	
	
	
	

}
