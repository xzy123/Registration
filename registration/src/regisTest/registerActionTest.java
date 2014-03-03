package regisTest;

import static org.junit.Assert.*;

import org.junit.Test;

import regist.action.registerAction;

public class registerActionTest {

	@Test
	public void testExecute() throws Exception {
		registerAction ra = new registerAction();
		ra.setUsername("a");
		ra.setPassword("a");
		String res = ra.execute();
		assertEquals("fail", res);
	}

}
