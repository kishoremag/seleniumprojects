package PojoClass;

public class StudentRegistrationService 
{
public void register(Student st)
{
	System.out.println(st.getStudentId());
	System.out.println(st.getStudentName());
	System.out.println(st.getUniversityName());
	System.out.println(st.getcollegeName());
	System.out.println(st.getGender());
}
public void save(Product p )
{
	System.out.println(p.getpid() );
	System.out.println(p.getpname() );
	
}

public void test(int x)
{
	System.out.println(x);
}

}
