// Program to show the detail of students using concept of inheritance

class Person {
    String firstName;
    String lastName;
    int age;
    String address;
    String email;
    String mobile;

    // Constructor to the class
    public Person(String firstName, String lastName, int age, String address, String email, String mobile) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.email = email;
        this.mobile = mobile;
    }
    
}


class Students extends Person{
//student class
	private String rollno;
	private String branch;
	public Students(String firstName, String lastName, int age, String address, String email, String mobile,String rollno,String branch){
        // invoking base class constructor
        super(firstName, lastName, age, address, email, mobile);
        this.rollno = rollno;
        this.branch = branch;
    }
	public void display(){
		System.out.println("Student Details");
		System.out.println("Name: "+firstName+" "+lastName);
		System.out.println("Age: "+age);
		System.out.println("Address: "+address);
		System.out.println("Email: "+email);
		System.out.println("Mobile: "+mobile);
		System.out.println("RollNo: "+rollno);
		System.out.println("Branch: "+branch);
	}
}

public class Q5 {
public static void main(String[] args) {
    Students s1 = new Students("Sachin", "Tendulkar", 20, "Delhi", "sachin@gmail.com", "9876543210", "0101IT191012","IT");
	s1.display();
}
}