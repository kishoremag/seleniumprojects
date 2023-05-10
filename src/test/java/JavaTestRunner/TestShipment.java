package JavaTestRunner;

import Javapractice.Shipment;

public class TestShipment 
{
public static void main(String[] args) 
{
	Shipment ship = new Shipment();
	System.out.println(ship.originLoc);
	System.out.println(ship.destLoc);
	int shipweight = ship.getShipmentWeight();
	System.out.println(shipweight);
}
}
