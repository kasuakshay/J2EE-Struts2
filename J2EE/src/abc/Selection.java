package abc;

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
	    	ap.setMovie_name(rs.getString(2));
	    	ap.setCd(rs.getString(3));
	    	ap.setDate(rs.getDate(4));
	    	ap.setDirector_name(rs.getString(5));
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
