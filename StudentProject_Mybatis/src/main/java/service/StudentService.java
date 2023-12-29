package service;

import java.util.List;

import dto.MajorDTO;
import dto.StudentDTO;
import mapper.MajorMapper;
import mapper.StudentMapper;

public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentMapper studentMapper;
	private MajorMapper majorMapper;
	private StudentService() {
		studentMapper = StudentMapper.getInstance();
		majorMapper = MajorMapper.getInstance();
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public List<StudentDTO> selectAllStudent() {
		return studentMapper.selectAllStudent();
	}

	public List<MajorDTO> selectAllMajor() {
		return majorMapper.selectAllMajor();
	}

	public int insertStudent(StudentDTO studentDTO) {
		return studentMapper.insertStudent(studentDTO);
	}

	public int deleteStudent(String studentNo) {
		return studentMapper.deleteStudent(studentNo);
	}

	public StudentDTO selectStudent(String studentNo) {
		if(studentNo == null || studentNo.equals(""))
			return null;
		return studentMapper.selectStudent(studentNo);
	}

	public int updateStudent(StudentDTO studentDTO) {
		return studentMapper.updateStudent(studentDTO);
	}

	public int insertMajor(MajorDTO majorDTO) {
		return majorMapper.insertMajor(majorDTO);
	}

	public int updateMajor(MajorDTO majorDTO) {
		return majorMapper.updateMajor(majorDTO);
	}

	public int deleteMajor(int majorNo) {
		return majorMapper.deleteMajor(majorNo);
	}

	
}







