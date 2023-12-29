package service;

import java.util.ArrayList;
import java.util.List;

import dao.StudentDAO;
import dto.MajorDTO;
import dto.StudentDTO;
import mapper.StudentMapper;

public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentDAO studentDao;
	private StudentMapper mapper;
	private StudentService() {
		studentDao = StudentDAO.getInstance();
		mapper = StudentMapper.getInstance();
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public List<StudentDTO> selectAllStudent() {
		return mapper.selectAllStudent();
	}

	public List<MajorDTO> selectAllMajor() {
		return mapper.selectAllMajor();
	}

	public int insertStudent(StudentDTO studentDTO) {
		return studentDao.insertStudent(studentDTO);
	}

	public int deleteStudent(String studentNo) {
		return studentDao.deleteStudent(studentNo);
	}

	public StudentDTO selectStudent(String studentNo) {
		if(studentNo == null || studentNo.equals(""))
			return null;
		return studentDao.selectStudent(studentNo);
	}

	public int updateStudent(StudentDTO studentDTO) {
		return studentDao.updateStudent(studentDTO);
	}

	public int insertMajor(MajorDTO majorDTO) {
		return studentDao.insertStudent(majorDTO);
	}

	public int updateMajor(MajorDTO majorDTO) {
		return studentDao.updateMajor(majorDTO);
	}

	public int deleteMajor(int majorNo) {
		return studentDao.deleteMajor(majorNo);
	}

	
}







