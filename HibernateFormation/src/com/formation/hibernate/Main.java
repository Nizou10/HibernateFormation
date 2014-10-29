package com.formation.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


public class Main {

	public static void main(String[] args) {
		
		
		// Write the Student_Info object into the database
		Student_Info student = new Student_Info();
		student.setName("student1");
		//student.setRoll_no(1);

		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();

		// this would save the Student_Info object into the database
		session.save(student);
		//validate transaction
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
