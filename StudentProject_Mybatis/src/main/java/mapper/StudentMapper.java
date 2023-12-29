package mapper;

import config.MybatisManager;

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
	
	
}




