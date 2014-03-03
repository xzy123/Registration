package regist.UserDAO;



import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import HibernateUtil.hibernateUtil;

import regist.model.User;

@Component("userDao")
public class UserDAOImpl implements UserDAO{
	
	SessionFactory sessionFactory ;
	

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Resource(name="sessionFactory")
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(User u) {
		// TODO Auto-generated method stub
		
		Session session = sessionFactory.getCurrentSession();
		//session.beginTransaction();
		session.save(u);
		//session.getTransaction().commit();
	}

	public boolean checkExistWithName(String username) {
		//sessionfactory = hibernateUtil.getSessionFactory();
		//Session session = sessionfactory.getCurrentSession();
		Session session = this.getSessionFactory().getCurrentSession();
		//session.beginTransaction();
		String sql = "select count(*) from User u where u.username = :username";
		long count = (Long) session.createQuery(sql).setString("username", username).uniqueResult();
		//session.getTransaction().commit();
		if(count > 0)
			return true;
		return false;
	}

	
	
}
