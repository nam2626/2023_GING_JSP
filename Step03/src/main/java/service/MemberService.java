package service;

import java.util.ArrayList;

import dao.MemberDAO;
import dto.MemberDTO;

public class MemberService {
	private static MemberService instance = new MemberService();

	private MemberService() {
	}

	public static MemberService getInstance() {
		if(instance == null)
			instance = new MemberService();
		return instance;
	}

	public ArrayList<MemberDTO> searchMember(String kind, String search) {
		return MemberDAO.getInstance().searchMember(kind,search);
	}

	
	
	
}
