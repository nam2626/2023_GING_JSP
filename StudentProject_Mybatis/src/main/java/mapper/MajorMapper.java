package mapper;

import java.util.List;

import config.MybatisManager;
import dto.MajorDTO;
import dto.StudentDTO;

public class MajorMapper {
	private static MajorMapper instance = new MajorMapper();
	private MybatisManager manager;

	private MajorMapper() {
		manager = MybatisManager.getInstance();
	}

	public static MajorMapper getInstance() {
		if (instance == null)
			instance = new MajorMapper();
		return instance;
	}

	public List<MajorDTO> selectAllMajor() {
		return manager.getSession().selectList("selectAllMajor");
	}

	public int insertMajor(MajorDTO majorDTO) {
		return manager.getSession().insert("insertMajor", majorDTO);
	}

	public int updateMajor(MajorDTO majorDTO) {
		return manager.getSession().update("updateMajor", majorDTO);
	}

	public int deleteMajor(int majorNo) {
		return manager.getSession().delete("deleteMajor", majorNo);
	}

	
}




