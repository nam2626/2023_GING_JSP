package mapper;

import java.util.List;

import config.MybatisManager;
import dto.MajorDTO;
import dto.StudentDTO;

public class StudentMapper {
	private static StudentMapper instance = new StudentMapper();
	private MybatisManager manager;

	private StudentMapper() {
		manager = MybatisManager.getInstance();
	}

	public static StudentMapper getInstance() {
		if (instance == null)
			instance = new StudentMapper();
		return instance;
	}

	public List<StudentDTO> selectAllStudent() {
		return manager.getSession().selectList("selectAllStudent");
	}

	public List<MajorDTO> selectAllMajor() {
		return manager.getSession().selectList("selectAllMajor");
	}

	public int insertStudent(StudentDTO studentDTO) {
		return manager.getSession().insert("insertStudent", studentDTO);
	}

	public int deleteStudent(String studentNo) {
		return manager.getSession().delete("deleteStudent", studentNo);
	}

	public StudentDTO selectStudent(String studentNo) {
		return manager.getSession().selectOne("selectStudent", studentNo);
	}

	public int updateStudent(StudentDTO studentDTO) {
		return manager.getSession().update("updateStudent", studentDTO);
	}
	
	
}




