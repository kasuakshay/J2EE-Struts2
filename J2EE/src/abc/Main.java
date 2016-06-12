package abc;

import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Main extends ActionSupport implements ModelDriven<User1>,SessionAware
{
 
	
	User1 user1=new User1();
	public SessionMap<String, Object> session;

	@Override
	public void setSession(Map<String, Object> map)
	{
		session = (SessionMap<String, Object>)map;
		session.put("username", "chetan");
	}
	
	public  String execute()
	{
		

		
	   String a=user1.getUsername();
       String b=user1.getPassword();
       System.out.println(a+b);
	   String c="admin";
	   String d="pass";
	   System.out.println(c+d);
		if(a.equals(c) && b.equals(d))
		{
			session.put("key",user1);
			String name=(String)session.get("username");
			addActionMessage("Login Successfull. Welcome "+name);
			return "SUCCESS";
		}
		else
			
		{
			addActionError("invalid user name password");
			return "fail";
			
		}
		
		
	}

	@Override
	public User1 getModel() {
		
		return user1;
	}


	

	

	
	

}
