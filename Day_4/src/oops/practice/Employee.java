package oops.practice;

public class Employee {
	String name;
	int    id;
	Employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	void displayDetails() {
		System.out.println("employee name:"+name);
		System.out.println("employee id:"+id);
	}
	public static void main(String[]args) {

	Employee emp=new Employee("ram", 3533);
	emp.displayDetails();
	}
}	

