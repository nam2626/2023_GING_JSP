package dto;

public class StudentDTO {
	private String studentNo;
	private String studentName;
	private double score;
	private String gender;
	private int majorNo;

	public StudentDTO() {
	}

	public StudentDTO(String studentNo, String studentName, double score, String gender, int majorNo) {
		this.studentNo = studentNo;
		this.studentName = studentName;
		this.score = score;
		this.gender = gender;
		this.majorNo = majorNo;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMajorNo() {
		return majorNo;
	}

	public void setMajorNo(int majorNo) {
		this.majorNo = majorNo;
	}

	@Override
	public String toString() {
		return "StudentDTO [studentNo=" + studentNo + ", studentName=" + studentName + ", score=" + score + ", gender="
				+ gender + ", majorNo=" + majorNo + "]";
	}

}
