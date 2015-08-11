package vit.automate.webportal;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import vit.automate.persistence.HibernateUtil;

public class App {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		/*System.out.println("maven -hibernate");
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		        
//		//from "Class name" not table name
		Query query = session.createQuery("from User where username =:username"+" and password =:password");
		
		query.setParameter("username","om");
		query.setParameter("password","dhoju");
		
		List<User> result = query.list();
		for(User user : result){
			System.out.println(user.getUsername());
		}
		
		System.out.println(result.size());*/
		
		ListTestCases testcases = new ListTestCases();
		testcases.testCases();
		
	}

}
