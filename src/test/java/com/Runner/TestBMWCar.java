package com.Runner;

import com.classes.BMWCar;

public class TestBMWCar {

	public static void main(String[] args) 
	{
		BMWCar  bmwcar = new BMWCar();//craete child class object creation
		//accessing parent class properties by using child class reference /object
		bmwcar.colour ="Black";
		bmwcar.modelNo=2007;
	//accessing child class properties by using child class reference /object
		bmwcar.gears = 6;
		bmwcar.bodystyle = "silver";
	//acessing parent class methods 
		bmwcar.printCarDetails();
		System.out.println("---------------------------");
		//acessing child class methods 
		bmwcar.printBMWCarDetails();

	}

}
