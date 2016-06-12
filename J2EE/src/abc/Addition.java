package abc;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Addition  extends ActionSupport implements ModelDriven<addPojo>{

	addPojo a1 = new addPojo();

	@Override
	public addPojo getModel() {
		
		return a1;
	}

	@Override
	public String execute() throws Exception {
		Connection conn=Jdbc.getConnection();
		PreparedStatement ps = null;
		String sql= "Insert into movies values(?,?,?,?,?)";
		ps=conn.prepareStatement(sql);
		ps.setString(1, a1.getId());
		ps.setString(2, a1.getMovie_name());
		ps.setString(3, a1.getCd());
		ps.setDate(4, a1.getDate());
		ps.setString(5, a1.getDirector_name());
		int val=ps.executeUpdate();
		System.out.println(val);
		
		addActionMessage("Movie Data Inserted Successfully");
		return "success";
		
	}
	
}
