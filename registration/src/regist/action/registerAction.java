package regist.action;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

import regist.model.User;
import regist.service.UserManager;
import regist.service.UserManagerImpl;

@Component("register")
@Scope("prototype")
public class registerAction extends ActionSupport {


	String username;
	String password;
	String password1;
	
	UserManager um ;

	public UserManager getUm() {
		return um;
	}

	@Resource(name="userManager")
	public void setUm(UserManager um) {
		this.um = um;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword1() {
		return password1;
	}

	public void setPassword1(String password1) {
		this.password1 = password1;
	}

	public String execute() throws Exception {
		User u = new User();
		u.setUsername(username);                                                                                 
		u.setPassword(password);
		 
		if(um.checkUser(u))
			return "fail";
		um.add(u);
		return "success";		
	}
}
