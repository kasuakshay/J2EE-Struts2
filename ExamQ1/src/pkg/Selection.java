package pkg;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

public class Selection extends ActionSupport
{
	static ArrayList<addPojo> al = new ArrayList<>();
	

	@Override
	public String execute() throws Exception {
		Connection conn=Jdbc.getConnection();
		PreparedStatement ps = null;
		String sql="select * from movies";
	    ps=conn.prepareStatement(sql);
	    ResultSet rs =ps.executeQuery();
	    al.clear();
	    while(rs.next())
	    {
	    	
	    	addPojo ap=new addPojo();
	    	ap.setId(rs.getString(1));
	    	ap.setMname(rs.getString(2));
	    	ap.setdType(rs.getString(3));
	    	ap.setDate(rs.getString(4));
	    	al.add(ap);
	    }
	    
		return SUCCESS;
	}

	public ArrayList<addPojo> getAl() {
		return al;
	}

	public void setAl(ArrayList<addPojo> al) {
		this.al = al;
	}
	
	
	
}
