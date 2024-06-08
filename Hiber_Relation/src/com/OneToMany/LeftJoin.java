package com.OneToMany;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LeftJoin {
 public static void main(String[] args) {
	
	 Configuration cfg = new Configuration();
	 cfg.configure("hibernate.cf.xml");
	 
	 SessionFactory sf = cfg.buildSessionFactory();
	 Session session =sf.openSession();
	 
  //   Query qry = session.createQuery("select v.vendorId, v.vendorName,c.customerId, c.customerName from Vendor v right join v.children c");
 
	// Query qry = session.createQuery("select v.vendorId, v.vendorName,c.customerId, c.customerName from Vendor v left join v.children c");
	 
	 Query qry = session.createQuery("select v.vendorId, v.vendorName,c.customerId, c.customerName from Vendor v inner join v.children c");
	 
	// Query qry = session.createQuery("select v.vendorId, v.vendorName,c.customerId, c.customerName from Vendor v inner join v.children c");
	 
	 List lst = qry.list();
	 Iterator it = lst.iterator();
	 
	 while(it.hasNext())
	 {
		 Object rows[] = (Object[])it.next();
		 System.out.println(rows[0]+" "+rows[1]+  " ==> "+rows[2]+ " " +rows[3]);
	 }
 }
}
