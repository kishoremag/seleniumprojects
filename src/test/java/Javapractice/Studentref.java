package Javapractice;

public class Studentref {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = st1;
		
		System.out.println(st1==st2);
		System.out.println(st3==st1);
		
	 

	}

}
