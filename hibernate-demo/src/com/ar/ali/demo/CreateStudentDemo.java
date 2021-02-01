package com.ar.ali.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.ar.ali.model.Student;

public class CreateStudentDemo {

	public static void main(String[] args) {
		
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		// create session
		Session session = factory.getCurrentSession();
		
		// use the session object to save Java object
		try {
			// create a student object
			System.out.println("Creating new student object...");
			Student temp = new Student("Ali", "Vilte", "vilte.emanuel@hotmail.com");
			
			// start a transaction 
			session.beginTransaction();
			
			// save the student object
			System.out.println("\nSaving the student object...");
			session.save(temp);
			
			// commit transaction
			session.getTransaction().commit();
			System.out.println("\nDone!");
			
		} finally {
			factory.close();
		}
	}

}
