package com.joinExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
   public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("project.cfg.xml");
	
	SessionFactory sf = cfg.buildSessionFactory();
	Session session = sf.openSession();
	
	
}
}
