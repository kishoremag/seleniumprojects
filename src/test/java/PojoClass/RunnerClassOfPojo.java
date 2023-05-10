package PojoClass;

public class RunnerClassOfPojo {

	public static void main(String[] args) 
	{
		StudentRegistrationService srs = new  StudentRegistrationService();
	    srs.test(10);
		
	    Student student = new Student();
	    student.setStudentId(101);
	    student.setStudentName("raja");
	    student.setUniversityName("JNTUA");
	    student.setCollegeName("KVSR");
	    student.setGender("Male");
	    
	    srs.register(student);
	    
	    //step2
	    
	    Product product = new Product();
	    product.setpid(9001);
	    product.setpname("laptop");
	    srs.save(product);
	    

	}

}
