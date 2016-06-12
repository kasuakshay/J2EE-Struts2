package pkg;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Main extends ActionSupport implements ModelDriven<User>,SessionAware
{

	User u = new User();
	public SessionMap<String, Object> session;
	
	@Override
	public void setSession(Map<String, Object> map)
	{
		session = (SessionMap<String, Object>) map;
		session.put("username", "KASURDE");
	}
	
	@Override
	public User getModel() {
		
		return u;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

	@Override
	public String execute() throws Exception 
	{
		
		String user=u.getUname();
		String pwd=u.getPass();
		System.out.println(user+" "+pwd);
		
		if (user.equals("admin") && pwd.equals("pass"))
		{
			session.put("key", u);
			String username = (String) session.get("username");
		addActionMessage("Welcome Librarian : Mr. "+username);
		return "success";
		}
		else
		{
			addActionError("Invalid Login Id and Password..!!");
		return "fail";
	
		}
	}



}
