package abc;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport
{
	SessionMap<String, Object> session;
	@Override
	public String execute() throws Exception {
		addActionMessage("Logged Out Successfully");
		return "success";
	}


}
