package main;

import java.util.List;

import dao.MemberMapper;
import dto.MemberDTO;

public class TestMain {

	public static void main(String[] args) {
		List<MemberDTO> list = MemberMapper.getInstance().selectAllMember();
		System.out.println(list.toString());
		System.out.println(list.size());
	}

}








