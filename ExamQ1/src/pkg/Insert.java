package pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
	PreparedStatement ps = null;
	String sql="Insert into movies values(?,?,?,?)";
	ps=con.prepareStatement(sql);
	ps.setString(1,apojo.getId());
	ps.setString(2,apojo.getMname());
	ps.setString(3,apojo.getdType());
	ps.setString(4,apojo.getDate());
	int x=ps.executeUpdate();
	System.out.println(x);
		addActionMessage("Data Inserted Successfully");
	return SUCCESS;

	}

}