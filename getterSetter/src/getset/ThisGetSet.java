package getset;

public class ThisGetSet {
	private int a=10;
	private int b=20;
	public int c=30;
	public void add()
	{
		System.out.println(a+b+c);
	}
	//this keyword looking up the value
	
	//if you want to automatically bring getter, setter method right clik go to source and go to generate getter setter,select the variable
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
	
}
