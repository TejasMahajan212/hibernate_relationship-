package com.manytomany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
   public static void main(String[] args) {
	
	   Session session =new Configuration().configure("manytomany.xml").buildSessionFactory().openSession();
	   
	   Student s1 = new Student();
	   s1.setStudId(101);
	   s1.setStuName("Samarth");
	   s1.setMarks(97);
	   
	   Student s2 = new Student();
	   s2.setStudId(103);
	   s2.setStuName("Mitansh");
	   s2.setMarks(95);
	   
	   Courses c1 = new Courses();
	   c1.setCourseId(1);
	   c1.setCourseName("Data Analyst");
	   c1.setDuration(2);
	   
	   Courses c2 = new Courses();
	   c2.setCourseId(2);
	   c2.setCourseName("Java Developer");
	   c2.setDuration(1);
	   
	   Set s = new HashSet();
	 
	   s.add(c1);
	   s.add(c2);
	    
	   c1.setStudents(s);
	   c2.setStudents(s);
	   
	 Transaction tx = session.beginTransaction();
	   session.save(s1);
	   session.save(s2);
	   tx.commit();
	   session.close();
}
}
