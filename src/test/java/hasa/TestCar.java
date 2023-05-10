package hasa;

public class TestCar {

	public static void main(String[] args) {
		BmwCar bmwcar = new BmwCar();
		System.out.println(bmwcar.getNoOfWheels());
		bmwcar.bmwCarStart();
		
		SwiftCar swiftcar = new SwiftCar();
		System.out.println(swiftcar.getNoOfWheels());
		swiftcar.swiftCarStart();
		

	}

}
