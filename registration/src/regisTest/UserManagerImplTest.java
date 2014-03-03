package regisTest;

import static org.junit.Assert.*;

import org.junit.Test;

import regist.model.User;
import regist.service.UserManager;
import regist.service.UserManagerImpl;

public class UserManagerImplTest {

	@Test
	public void testAdd() {
		UserManager um = new UserManagerImpl();
		User u = new User();
		u.setUsername("f");
		u.setPassword("f");
		//um.add(u);
	}

	@Test
	public void testCheckUser() {
		UserManager um = new UserManagerImpl();
		User u = new User();
		u.setUsername("a");
		u.setPassword("a");
		boolean res = um.checkUser(u);
		assertEquals(true, res);
	}

}
