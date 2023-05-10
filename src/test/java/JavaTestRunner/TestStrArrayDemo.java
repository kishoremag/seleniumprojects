package JavaTestRunner;

import Javapractice.StrArrayDemo;

public class TestStrArrayDemo 
{
 public static void main(String[] args) 
 {
	 StrArrayDemo sname =new StrArrayDemo();
	 
	/* String[] sdnamearr = new String[4];*/
	 
	 String[] sdnamearr = {"raja","raji","rajesh","raj"};
	 
	 /*sdnamearr[0] = "RAJA";
	 sdnamearr[1] = "RAJI";
	 sdnamearr[2] = "RAJESH";
	 sdnamearr[3] = "RAJ";*/
	 
	 sname.printStringElements(sdnamearr.length);
}
}
