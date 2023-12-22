package dao;

public class MemberDAO {
	private static MemberDAO instance = new MemberDAO();

	private MemberDAO() {	}

	public static MemberDAO getInstance() {
		if(instance == null)
			instance = new MemberDAO();
		return instance;
	}

	
}
