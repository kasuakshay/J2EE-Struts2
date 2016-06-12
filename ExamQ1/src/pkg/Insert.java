package pkg;

import java.sql.Connection;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Insert extends ActionSupport implements ModelDriven<addPojo>
{
	addPojo apojo = new addPojo();
	
	@Override
	public addPojo getModel()
	{
		return apojo;
	}
	
	@Override
	public String execute() throws Exception 
	{
	Connection con= Jdbc.getConnection();
	
	return SUCCESS;
	}
}
