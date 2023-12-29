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

	public int deleteStudent(String studentNo) {
		String sql = "delete from student where std_no like ?";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setString(1, studentNo);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			manager.close(null, pstmt);
		}
		return result;
	}

	public StudentDTO selectStudent(String studentNo) {
		StudentDTO dto = null;

		String sql = "select * from student where std_no like ?";
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setString(1, studentNo);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				dto = new StudentDTO(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getString(4),
						rs.getInt(5));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			manager.close(rs, pstmt);
		}
		return dto;
	}

	public int updateStudent(StudentDTO studentDTO) {
		String sql = "update student set std_name = ?, std_score = ?, "
				+ "gender = ?, major_no = ? "
				+ "where std_no like ?";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setString(5, studentDTO.getStudentNo());
			pstmt.setString(1, studentDTO.getStudentName());
			pstmt.setDouble(2, studentDTO.getScore());
			pstmt.setString(3, studentDTO.getGender());
			pstmt.setInt(4, studentDTO.getMajorNo());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			manager.close(null, pstmt);
		}
		return result;
	}

	public int insertStudent(MajorDTO majorDTO) {
		String sql = "insert into major values(?,?)";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setInt(1, majorDTO.getMajorNo());
			pstmt.setString(2, majorDTO.getMajorName());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			manager.close(null, pstmt);
		}
		
		return result;
	}

	public int updateMajor(MajorDTO majorDTO) {
		String sql = "update major set major_name = ? where major_no = ?";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setString(1, majorDTO.getMajorName());
			pstmt.setInt(2, majorDTO.getMajorNo());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			manager.close(null, pstmt);
		}
		
		return result;
	}

	public int deleteMajor(int majorNo) {
		String sql = "delete from major where major_no = ?";
		PreparedStatement pstmt = null;
		int result = 0;
		try {
			pstmt = manager.getConn().prepareStatement(sql);
			pstmt.setInt(1, majorNo);
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			manager.close(null, pstmt);
		}
		
		return result;
	}

}







