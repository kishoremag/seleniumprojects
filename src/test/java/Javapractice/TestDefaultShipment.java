package Javapractice;

public class TestDefaultShipment {

	public static void main(String[] args) 
	{
		DefaultShipment ds = new DefaultShipment();
		System.out.println(ds.originLoc);
		System.out.println(ds.destLoc);
        int s = ds.getShipmentWeight();
        System.out.println(s);
	}

}
