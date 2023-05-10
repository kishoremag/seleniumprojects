package Javapractice;

public class WhileService 
{
public int findTotalSumOf1To10Numbers() 
{
	int x =1;
	int sum = 0;
	while (x<=10)
	{
		sum = sum+x;
		++x;
	}
	return sum;
}
}
