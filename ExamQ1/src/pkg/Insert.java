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
	ps.setString(0,apojo.getId());
	ps.setString(1,apojo.getMname());
	ps.setString(2, apojo.getdType());
	ps.setString(3, apojo.getDate());
	int x=ps.executeUpdate();
	if (x==0)
	{
		addActionError("Data Insertion Failed");
		return "fail";
	}
	addActionMessage("Data Inserted Successfully");
	return "success";
	}
}
