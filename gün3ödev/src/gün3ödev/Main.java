package gün3ödev;

public class Main {

	public static void main(String[] args) {

		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("engin");
		instructor.setLastName("demirog");
		instructor.setEmail("engin@hotmail.com");
		instructor.setSalary(10000);
		
		System.out.println("Eğitmenin İsmi: " + instructor.getFirstName());
		
		Student student = new Student();
		student.setId(2);
		student.setFirstName("furkan");
		student.setLastName("candan");
		student.setEmail("furkan@hotmail.com");
		student.setNumber("1307");
		
		System.out.println("Öğrencinin İsmi: " + student.getFirstName());
		
		System.out.println("--------------------------------------------");
	
		UserManager userManager = new UserManager();
		userManager.add(student);
		userManager.delete(instructor);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.salaryUpdate(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.numberUpdate(student);
		
	}

}
