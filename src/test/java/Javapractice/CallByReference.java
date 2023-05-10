package Javapractice;

public class CallByReference 
{
public int sid;
public String sname;

public CallByReference(int sid,String sname)
{
	this.sid= sid;
	this.sname = sname;
	
}
public int getsid()
{
	return sid;
}
public void setsid(int sid)
{
	this.sid=sid;
}
public String getsname()
{
	return sname;
}

public void setsname(String sname)
{
	this.sname = sname;
}


}
