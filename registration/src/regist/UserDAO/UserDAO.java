package regist.UserDAO;

import regist.model.User;

public interface UserDAO {
	public void save(User u);
	public boolean checkExistWithName(String username);
}
