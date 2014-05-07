package struct2Test.controller;

import com.opensymphony.xwork2.ActionSupport;
import struct2Test.controller.LoginCheck;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;
	LoginCheck lc = new LoginCheck();
	
	public void validate(){
		if(username == null || "".equals(username.trim())){
			addFieldError("username", "username is required");
		}
		
		if(password == null || "".equals(password.trim())){
			addFieldError("password", "password is required");
		}
	}
	
	public String execute() throws Exception{
		if(lc.isLogin(username,password)){
			return "success";
		} else{
			addFieldError("username","invald username or password");
			return "error";
			
		}
	}
	
		
	public void setUsername(String username){
		this.username = username;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getUsername(){
		return username;
	}

}
