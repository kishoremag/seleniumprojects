package Javapractice;

public class SwitchStringService 
{
public void performArthematicOperations
(String operator,int firstNum,int secondNum)
{
	switch(operator)
	{
	case "+" :
		int sum = firstNum+secondNum;
		      System.out.println(sum);
		      break;
	case "-" :
		int sub = firstNum-secondNum;
		       System.out.println(sub);
		       break;
	case "*":
		int mult = firstNum*secondNum;
		      System.out.println(mult);
		      break;
	case "%":
		int mod = firstNum%secondNum;
	      System.out.println(mod);
	      break;
	default :
		
		System.out.println("INVALID ARTHEMATIC OPERATORS");
		      
		      
	}
}
}
