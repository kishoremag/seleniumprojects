package JavaTestRunner;

import Javapractice.ForEachLoopForArrays;

public class TestForEachLoopForArrays {

	public static void main(String[] args) {
		ForEachLoopForArrays fcl = new ForEachLoopForArrays();
		int[]  empidArr = {10,20,30,40};
		fcl.retrivePrimitiveArrayElements(empidArr);
		String[] stnameArr = {"raja","shekar","prem"};
		fcl.retriveReferenceArrayElements(stnameArr);
		

	}

}
