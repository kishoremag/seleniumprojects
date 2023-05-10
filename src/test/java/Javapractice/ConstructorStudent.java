package Javapractice;

public class ConstructorStudent {
	  public int sid;
	  public String Sname;
	  public String Address;
	  
	  public ConstructorStudent() {
		  System.out.println("zero Constructor");
		  
	  }
	  public ConstructorStudent(int sid,String Sname,String Address)
	  {
		 this.sid = sid;
		 this.Sname = Sname;
		 this.Address = Address;
	  }
  }

