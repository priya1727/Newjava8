package com.service;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Reg;

public class Login {
	public void add(int id, String name, String address, String city) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Reg reg = new Reg(id, name, address, city);

		session.save(reg);

		tx.commit();
		session.close();
	}

	public void update(int id) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Reg reg = new Reg();
		session.update(reg);
		tx.commit();
		session.close();
		factory.close();
	}

	public void delete() {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Reg reg = new Reg();
		session.delete(reg);
		tx.commit();
		session.close();
		factory.close();
	}

	public void view() {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Reg reg = new Reg();
		Query q = session.createQuery("from Reg");
		List<Reg> list=q.list();
		for(Reg r: list) {
			System.out.println(r.getId()+" : "+r.getName()+" : "+r.getAddress()+" : "+r.getCity());
		}
		tx.commit();
		session.close();
		factory.close();
		

	}
}
