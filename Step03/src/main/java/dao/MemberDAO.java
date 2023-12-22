package dao;

import java.util.ArrayList;

import dto.MemberDTO;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();

	private MemberDAO() {	}

	public static MemberDAO getInstance() {
		if(instance == null)
			instance = new MemberDAO();
		return instance;
	}

	public ArrayList<MemberDTO> searchMember(String kind, String search) {
		return null;
	}

	
}







