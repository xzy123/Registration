package HibernateUtil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class hibernateUtil {
	private static SessionFactory sf;
		static{
		Configuration config = new Configuration();
		ServiceRegistry resgistry = new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		sf = config.buildSessionFactory(resgistry);
	}
	
	public static SessionFactory getSessionFactory(){
		return sf;
	}
	/*
	static {
		sf = new AnnotationConfiguration().configure().buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return sf;
	}
	*/
}
