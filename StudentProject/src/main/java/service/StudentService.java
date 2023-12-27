package service;

import java.util.ArrayList;

import dao.StudentDAO;
import dto.MajorDTO;
import dto.StudentDTO;

public class StudentService {
	private static StudentService instance = new StudentService();
	private StudentDAO studentDao;
	private StudentService() {
		studentDao = StudentDAO.getInstance();
	}

	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}

	public ArrayList<StudentDTO> selectAllStudent() {
		return studentDao.selectAllStudent();
	}

	public ArrayList<MajorDTO> selectAllMajor() {
		return studentDao.selectAllMajor();
	}

	public int insertStudent(StudentDTO studentDTO) {
		return studentDao.insertStudent(studentDTO);
	}

	
}



