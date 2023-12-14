public class StudentTester {
	int Id;
	String Name;
	int Marks;
	String RStatus;
	int Year;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getMarks() {
		return Marks;
	}

	public void setMarks(int marks) {
		Marks = marks;
	}

	public String getRStatus() {
		return RStatus;
	}

	public void setRStatus(String rStatus) {
		RStatus = rStatus;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentTester student = new StudentTester();
		student.setName("Jacob");
		student.setId(7);
		student.setMarks(80);
		student.setRStatus("H");
		student.setYear(25);
		System.out.println("Student Name :"+student.Name);
		System.out.println("Student Id :"+student.Id);
		System.out.println("Qualifying marks :"+student.Marks);
		System.out.println("Residential status :"+student.RStatus);
		System.out.println("Year of Engineering :"+student.Year);
	}
	
}