package Javapractice;

public class NestedIfElseService 
{
public  String getStudentDistintionByTotalMarks(int TotalMarks)
{
	String result = null;
	if(TotalMarks>=360)
	{
		result = "Firstclass";
	}
	else if(TotalMarks<360&&TotalMarks>240)
	{
		result = "SecondClass";
	}
	else if (TotalMarks<360&&TotalMarks>=200)
	{
		result = "ThirdClass";
	}
	else
	{
		result = "Failed..";
	}
	return result ;
}
}
