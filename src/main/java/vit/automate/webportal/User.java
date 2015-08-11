package vit.automate.webportal;

import java.util.List;

import java.util.Map;

import org.hibernate.Query;
import org.hibernate.Session;

import vit.automate.persistence.HibernateUtil;

public class User {
	
	private int id;
	private String Username;
	private String Password;
	private int type;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
	public static void save(){
		 /*session.beginTransaction();
        User user = new User();
 
        user.setUsername("Jenny");
        user.setPassword("password");
//        user.setId(4);
       // user.setType(1);
 
        session.save(user);
        session.getTransaction().commit();
		*/
	}
	public User checklogin( Map<String, String> param) throws Exception{
		
		Session session = HibernateUtil.getSessionFactory().openSession();
        
//		//from "Class name" not table name
		Query query = session.createQuery("from User where username =:username"+" and password =:password");
		
		query.setParameter("username",param.get("username"));
		query.setParameter("password",param.get("password"));
		
		List<User> result = query.list();
		
		if(result != null && result.size() == 1){
			for(User user : result){
				return  user;
			}
		} else {
			throw new Exception("Invalid User");
		}
		return null;
		
	}			

	
}
