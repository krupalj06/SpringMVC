package com.krupa.web;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LodgeDao {
	
	void save(Lodge lodge) {
		
		SessionFactory factory = null;
		Session session = null;
		try {
		Configuration config = new Configuration();
		config.configure("resources/hibernate.cfg.xml");
		
		 factory = config.buildSessionFactory();
		
		session = factory.openSession();
		
		Transaction tran = session.beginTransaction();
		 session.save(lodge);
		tran.commit();
		System.out.println("Successfully saved");
		
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(session!=null) {
				session.close();
			}
			if(factory!= null ) {
				factory.close();
			}
		}
	}
 
	Lodge getLodgeDetail(int roomId) {
		
		Lodge log = new Lodge();
		log.setRoomid(roomId);
		log.setLocation("bangalore");
		log.setNoOfDays(3);
		log.setPx(2);
		log.setLodgeName("Lalith Ashok");
		
		return log;
		
	}
}
