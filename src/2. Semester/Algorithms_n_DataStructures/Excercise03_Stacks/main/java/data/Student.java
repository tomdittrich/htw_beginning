package data;

public class Student {

	private String prename;
	private String surname;
	private int mn;
	private Gender gender;
	private String course;
	
	public Student(String prename, String surname, int mn, Gender gender, String course) {
		super();
		this.prename = prename;
		this.surname = surname;
		this.mn = mn;
		this.gender = gender;
		this.course = course;
	}
	
	public String getPrename() {
		return prename;
	}

	public void setPrename(String prename) {
		this.prename = prename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getMn() {
		return mn;
	}

	public void setMn(int mn) {
		this.mn = mn;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [prename=" + prename + ", surname=" + surname + ", mn=" + mn + ", gender=" + gender
				+ ", course=" + course + "]";
	}

}
