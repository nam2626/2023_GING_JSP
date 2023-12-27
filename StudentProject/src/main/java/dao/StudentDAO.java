package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DBManager;
import dto.StudentDTO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();
	private DBManager manager;
	private StudentDAO() {	
		manager = DBManager.getInstance();
	}

	public static StudentDAO getInstance() {
		if(instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public ArrayList<StudentDTO> selectAllStudent() {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		
		String sql = "select * from student";
		
		try {
			PreparedStatement pstmt = manager.getConn().prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				list.add(new StudentDTO(rs.getString(1), rs.getString(2), 
						rs.getDouble(3), rs.getString(4), rs.getInt(5)));
			}
			manager.close(rs, pstmt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	
	
}









