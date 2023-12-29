package main;

import java.util.HashMap;
import java.util.List;

import dao.MemberMapper;
import dto.MemberDTO;

public class TestMain {

	public static void main(String[] args) {
		//전체 데이터 조회
//		List<MemberDTO> list = MemberMapper.getInstance().selectAllMember();
//		System.out.println(list.toString());
//		System.out.println(list.size());
		//단일 데이터 조회
		//로그인
		HashMap<String, Object> param = new HashMap<String, Object>();
		param.put("id", "KM1873");
		param.put("passwd", "123456");
		MemberDTO dto = MemberMapper.getInstance().login(param);
		System.out.println(dto);
	}

}








