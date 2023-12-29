package dto;

public class MajorDTO {
	private int majorNo;
	private String majorName;

	public MajorDTO(int majorNo, String majorName) {
		this.majorNo = majorNo;
		this.majorName = majorName;
	}

	public MajorDTO() {
	}

	public int getMajorNo() {
		return majorNo;
	}

	public void setMajorNo(int majorNo) {
		this.majorNo = majorNo;
	}

	public String getMajorName() {
		return majorName;
	}

	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}

	@Override
	public String toString() {
		return "MajorDTO [majorNo=" + majorNo + ", majorName=" + majorName + "]";
	}

}
