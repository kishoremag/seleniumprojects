package Javapractice;


public class Samplejava 
{
  int x ;
  
  public Samplejava()
  {
	  x= 10;
  }
  public void display() 
  {
	 System.out.println(x); 
  }
  public static void main(String[] args)
  {
	  Samplejava obj = new Samplejava();
	  obj.display();
  }
  
}
