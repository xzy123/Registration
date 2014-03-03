package regisTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import regist.action.registerAction;
import regist.model.User;
import regist.service.UserManager;

public class actionTest {

	@Test
	public void test() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"beans.xml");

		registerAction service = (registerAction) ctx.getBean("register");
		System.out.println(service.getClass());
		try {
			//service.username = "ccc";
			//service.password = "ccc";
			String res = service.execute();
			assertEquals("fail", res);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ctx.destroy();
	}

}
