package com.OneToMany;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Executable {
     
  public static void main(String[] args) {
	
	  Session session = new Configuration().configure("hibernate.cf.xml").buildSessionFactory().openSession();
	  Vendor v = new Vendor();
	  v.setVendorId(1);
	  v.setVendorName("SaiMobile");
	  
	  Customer c1 = new Customer();
	  c1.setCustomerId(101);
	  c1.setCustomerName("Kiran");
	  
	  Customer c2  =new Customer();
	  c2.setCustomerId(102);
	  c2.setCustomerName("Anil");
	  
	  //Customer c3 =new Customer();
	 // c3.setCustomerId(103);
	  //c3.setCustomerName("Manohar");
	  
	  Set s = new HashSet();
	  s.add(c1);
	  s.add(c2);
	//  s.add(c3);
	  
	  v.setChildren(s);
	  
	  Transaction tx = session.beginTransaction();
	 
	  session.save(v);
	  tx.commit();
	  session.close();
	 
     }
  }
