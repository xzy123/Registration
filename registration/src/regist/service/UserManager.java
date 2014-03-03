package regist.service;

import regist.model.User;

public interface UserManager {
	public void add(User u);
	public boolean checkUser(User u);
}
