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
//		HashMap<String, Object> param = new HashMap<String, Object>();
//		param.put("id", "KM1873");
//		param.put("passwd", "123456");
//		MemberDTO dto = MemberMapper.getInstance().login(param);
//		System.out.println(dto);
//		MemberDTO dto = new MemberDTO("A111", "1234", "dddd", 33, "A", 3);
//		int result = MemberMapper.getInstance().insertMember(dto);
//		System.out.println(result);
		//나이가 20세 미만은 삭제, 삭제한 건수도 출력
//		int result = MemberMapper.getInstance().deleteMember(20);
//		System.out.println(result);
		//회원 등급이 1,3,5인 회원의 나이를 현재 나이의 +5를 해주는 업데이트 수행
//		int[] grade = {1, 3, 5};
//		int result = MemberMapper.getInstance().updateAge(grade);
//		System.out.println(result);
		HashMap<String, Object> map = new HashMap<String, Object>();
//		map.put("kind", "name");
//		map.put("search", "김");
//		map.put("kind", "age");
//		map.put("search", 30);
		map.put("kind", "gender");
		map.put("search", 'F');
		
		List<MemberDTO> list = MemberMapper.getInstance().searchMember(map);
		list.forEach(e -> System.out.println(e));
	}

}








