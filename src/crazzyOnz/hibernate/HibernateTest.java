package crazzyOnz.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import crazzyOnz.hibernate.dto.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		
		UserDetails user=new UserDetails();
		user.setUserId(10);user.setUserName("Abhishek"); 

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(user);  
		session.getTransaction().commit();

	}

}
