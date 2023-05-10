package SuperVsThis;

public class Student extends Person{
	public int sid = 1001;
	public String name = "sekhar";
	public void printPersonDetails() {
		System.out.println(super.name);
		System.out.println(this.sid);
		String address = super.getAddress();
		System.out.println(address);
		String cname = this.getCollegeName();
		System.out.println(cname);
	}
	public String getCollegeName() {
		return "CBIT";
	}

}
