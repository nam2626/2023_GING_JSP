package dao;

import java.util.HashMap;
import java.util.List;

import config.DBManager;
import dto.MemberDTO;

public class MemberMapper {
	private static MemberMapper instance = new MemberMapper();
	private DBManager manager;
	
	private MemberMapper() {
		manager = DBManager.getInstance();
	}
	
	public static MemberMapper getInstance() {
		if(instance == null)
			instance = new MemberMapper();
		return instance;
	}
	
	public List<MemberDTO> selectAllMember(){
		return manager.getSession().selectList("selectAllMember");
	}

	public MemberDTO login(HashMap<String, Object> param) {
		return manager.getSession().selectOne("login", param);
	}

	public int insertMember(MemberDTO dto) {
		return manager.getSession().insert("insertMember", dto);
	}

	public int deleteMember(int i) {
		return manager.getSession().delete("deleteMember", i);
	}

	public int updateAge(int[] grade) {
		return manager.getSession().update("updateAge", grade);
	}

}







