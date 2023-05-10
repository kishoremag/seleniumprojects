package SuperVsThis;

public class TestLocalInstnaceVarDemo {
	
	int x; // instance variable
	                    // x = 10
	public void foo(int x) { // x is locla variable
		this.x = x;
		System.out.println(this.x);
	}
	
	public static void main(String[] args) {
		TestLocalInstnaceVarDemo  testInstVarDemo = new TestLocalInstnaceVarDemo();
		testInstVarDemo.foo(10);
	}
}
