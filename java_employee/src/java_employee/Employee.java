package java_employee;


public class Employee {
	String name;
	int age;
	double salary;

	public static void main(String[] args) {
		Employee obj=new Employee(); //Create an object of the Employee class (this is created when we use multiple versions)
		obj.age=25;
		obj.name="Abhi";
		obj.salary=40000;
		System.out.println("Name, Age & Salary of an Employee are\n" +obj.name +" " +obj.age +" " +"&" +" " +obj.salary);

	}

}