package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DBManager;
import dto.MajorDTO;
import dto.StudentDTO;

public class StudentDAO {
	private static StudentDAO instance = new StudentDAO();
	private DBManager manager;

	private StudentDAO() {
		manager = DBManager.getInstance();
	}

	public static StudentDAO getInstance() {
		if (instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public ArrayList<StudentDTO> selectAllStudent() {
		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();

		String sql = "select * from student";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new StudentDTO(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
						rs.getInt(5)));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			manager.close(rs, pstmt);
		}
		return list;
	}

	public ArrayList<MajorDTO> selectAllMajor() {
		ArrayList<MajorDTO> list = new ArrayList<MajorDTO>();

		String sql = "select * from major";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next())
				list.add(new MajorDTO(rs.getInt(1), rs.getString(2)));

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			manager.close(rs, pstmt);
		}

		return list;
	}

	public int insertStudent(StudentDTO studentDTO) {
		String sql = "insert into student values(?,?,?,?,?)";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setString(1, studentDTO.getStudentNo());
			pstmt.setString(2, studentDTO.getStudentName());
			pstmt.setDouble(3, studentDTO.getScore());
			pstmt.setString(4, studentDTO.getGender());
			pstmt.setInt(5, studentDTO.getMajorNo());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			manager.close(null, pstmt);
		}
		return result;
	}

}







