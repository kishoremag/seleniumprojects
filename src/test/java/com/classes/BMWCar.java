package com.classes;

public class BMWCar extends Car
{
public int gears;
public String bodystyle;

public void printBMWCarDetails()
{
	System.out.println("Car Gears:"+gears);
	System.out.println("Car BodyStyle:"+bodystyle);
	System.out.println("Car Colour:"+colour);//accessing parent class properties from child class
	System.out.println("Car Model:"+modelNo);//accessing parent class properties from child class
	printCarDetails();//accessing parent class method from child class 
}


}
