package getset;

public class MainThisGetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisGetSet abc=new ThisGetSet();
		abc.c=50;
		System.out.println(abc.c);
		abc.add();
		//we can't get the value of a and b like( abc.a or abc.b). because they are private variables in TestGetSet
		//so we have to call a and b through get, set methods
		System.out.println("Before set the value of 'a' is "+abc.getA());//only get a,so a=10
		
		abc.setA(100);
		System.out.println("After set the value of 'a' is "+abc.getA());//set a=100,so a=100;
	}

}
