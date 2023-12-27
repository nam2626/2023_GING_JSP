package service;

import dao.StudentDAO;

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

	
}
