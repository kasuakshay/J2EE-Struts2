package abc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Deletion extends ActionSupport implements ModelDriven<delPojo>{

	delPojo d1 = new delPojo();
	@Override
	public delPojo getModel() {
		
		return d1;
	}
	@Override
	public String execute() throws Exception {
		Connection conn=null;
		PreparedStatement ps = null;
		conn = Jdbc.getConnection();
		String sql= "delete from movies where movie_id=?";
		ps=conn.prepareStatement(sql);
		ps.setString(1, d1.getDelete());
		
		int val=ps.executeUpdate();
		System.out.println(val);
		
		addActionMessage("Movie Data deleted Successfully");
		return SUCCESS;
	}

}
