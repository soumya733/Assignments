package com.oehm5.hibernate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

/*public class RegisterHqlDao {
	public List<UserRegistration> getUsers() {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		Session session = sessionFactory.openSession();
		String hql = "from UserRegistration";
		Query query = session.createQuery(hql);
		return query.list();
}

public UserRegistration getUserByEmail(String email) {
	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	String hql = "from UserRegistration where email=:e";
	Query query = session.createQuery(hql);
	query.setParameter("e", email);
	return (UserRegistration) query.uniqueResult();
}

public void updateMobileNumberById(String newMobileNumber, Long id) {
	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	String hql = "update UserRegistration set mobileNumber=:mobileNumber where id=:id";
	Query query = session.createQuery(hql);
	query.setParameter("mobileNumber", newMobileNumber);
	query.setParameter("id", id);
	int rows = query.executeUpdate();
	transaction.commit();
	if(rows != 0) {
		System.out.println("Update Operation sucessfull");
	}else {
		System.out.println("update operation failed");
	}
}

public void deleteUserById(Long id) {
	Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory sessionFactory = cfg.buildSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	String hql = "delete from UserRegistration where id=:id";
	Query query = session.createQuery(hql);
	query.setParameter("id", id);
	int rows = query.executeUpdate();
	transaction.commit();
	if(rows != 0) {
		System.out.println("Delete Operation sucessfull");
	}else {
		System.out.println("Delete operation failed");
	}
}

}*/
