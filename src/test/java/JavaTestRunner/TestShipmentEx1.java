package JavaTestRunner;

import Javapractice.ShipmentEx1;

public class TestShipmentEx1 
{
public static void main(String[] args) {
	ShipmentEx1 shipe1 = new ShipmentEx1();
	System.out.println(shipe1.originLoc);
	System.out.println(shipe1.destLoc);
	String s =ShipmentEx1 .getPackageName("kishore");
		System.out.println(s);	
	
}
}
