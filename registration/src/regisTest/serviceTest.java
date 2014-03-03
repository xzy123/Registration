package regisTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import regist.model.User;
import regist.service.UserManager;
import regist.service.UserManagerImpl;

public class serviceTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		UserManager service = (UserManager)ctx.getBean("userManager");
		System.out.println(service.getClass());
		service.add(new User());
		
		ctx.destroy();
	}

}
