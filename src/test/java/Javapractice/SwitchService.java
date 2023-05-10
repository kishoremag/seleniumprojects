package Javapractice;

public class SwitchService 
{
public void findWeekDayName(int weekDayNumber)
{
	switch(weekDayNumber)
	{
	case 1:
		System.out.println("Today is Sunday");
		break;
	
	case 2:
		System.out.println("Today is Monday");
		break;
		
	case 3:
		System.out.println("Today is Tuesday");
		break;
		
	case 4:
		System.out.println("Today is Wednesday");
		break;
		
	case 5:
		System.out.println("Today is Thrusday");
		break;
		
	case 6:
		System.out.println("Today is Friday");
		break;
		
	case 7:
		
		System.out.println("Today is Saturday");
		break;
		
		default:
			
			System.out.println("INVALID WEEK DAY");
		
}
}
}