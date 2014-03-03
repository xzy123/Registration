package regist.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import regist.UserDAO.UserDAO;
import regist.UserDAO.UserDAOImpl;
import regist.model.User;

@Component("userManager")
public class UserManagerImpl implements UserManager{

	UserDAO userDao;
	
	public UserDAO getUserDao() {
		return userDao;
	}

	@Resource(name="userDao")
	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}

	public void add(User u) {
		userDao.save(u);
	}

	public boolean checkUser(User u) {
		
		if(userDao.checkExistWithName(u.getUsername()))
			return true;
		return false;
	}
	
}
