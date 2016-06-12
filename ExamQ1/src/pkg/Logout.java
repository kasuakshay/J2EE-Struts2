package pkg;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport{

	@Override
	public String execute() throws Exception {
		addActionMessage("Logged Out Successfully..!!!");
		return SUCCESS;
	}

	
}
