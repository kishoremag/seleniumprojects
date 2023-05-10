package org.maginita.practice;

public interface Myinterface 
{
//1.static properties as constants only	
static int x = 10;
//2.non-static properties as constants only	
int y =86;
//static method with body
public static void method1()
{
  System.out.println(x+y);
}
//non static method without body
public void method2();
}
