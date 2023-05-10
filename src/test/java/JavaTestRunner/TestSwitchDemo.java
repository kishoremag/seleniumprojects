package JavaTestRunner;

import Javapractice.SwitchStringService;

public class TestSwitchDemo {

	public static void main(String[] args) 
	{
		SwitchStringService sss = new SwitchStringService();
		sss.performArthematicOperations("+", 10, 5);
		sss.performArthematicOperations("-", 10, 5);
		sss.performArthematicOperations("*", 10, 5);
		sss.performArthematicOperations("%", 10, 5);

	}

}
