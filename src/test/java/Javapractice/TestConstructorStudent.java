package Javapractice;

public class TestConstructorStudent {

	public static void main(String[] args) {
		ConstructorStudent st1  = new ConstructorStudent(101,"kishore","xxx");
		System.out.println(st1.sid);
		System.out.println(st1.Sname);
		System.out.println(st1.Address);
		
		ConstructorStudent st2  = new ConstructorStudent(102,"kuruva","xxxx");
		System.out.println(st2.sid);
		System.out.println(st2.Sname);
		System.out.println(st2.Address);

	}

}
