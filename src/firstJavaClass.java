
public class firstJavaClass {

	public static void main(String[] args) {
		Student std1 = new Student();//Creating an object of type student
        std1.name="neha";
		System.out.println(std1.name); // accessing property 
		
		std1.attendSession(); // calling the class method so() is required
		
		Student std2 = new Student();
		std2.name="Darsh";
		System.out.println(std2.name);
	}

}

class Student{
	String name;    //-----> properties or data or instance variable
	int rollNo;
	String course;
	//constructor
	
	void attendSession(){  //-----> Behavior or instance method
		System.out.println("Attend the session on time");
	   // open webex
		// login to webex using your roll no.
		// join the course you have enrolled
	}
	
	void leaveSession() {
		// leave the session by clicking on the button
	}
	
	void askQuestion() {
		
	}
}
