package java_student;

class StudentMarks {
	
	//Private data members (encapsulation)
	private String Name;
	private int Marks;
	
	 // setter method for Name
	public void setName(String name) {
		Name = name;
	}
	
	//Getter method for Name
	public String getName() {
		return Name;
	}

	// setter method for marks
	public void setMarks(int marks) {
		Marks = marks;
	}
	
	//Getter method for marks
	public int getMarks() {
		return Marks;
	}

	public static void main(String[] args) {
		StudentMarks obj=new StudentMarks();
		obj.setName("Shankar");
		obj.setMarks(45);
		System.out.println(obj.getName() +":" +obj.getMarks());
		
		obj.setName("Pramodh");
		obj.setMarks(42);
		System.out.println(obj.getName() +":" +obj.getMarks());

	}

}