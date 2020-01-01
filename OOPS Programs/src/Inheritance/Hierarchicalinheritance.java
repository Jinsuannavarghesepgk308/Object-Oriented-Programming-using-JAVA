package Inheritance;

import java.util.Scanner;

public class Hierarchicalinheritance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.next();
		
		Mango m=new Mango();
		Apple a=new Apple();
		m.about();
		m.color();
		a.color();
				
		// TODO Auto-generated method stub

	}

}
class Type {
	void about()
	{
		System.out.println("Mango");
		System.out.println("Apple");
	}
	
}
class Mango extends Type {
	void color()
	{
		System.out.println("Mango is Yellow color");
	}
}
class Apple extends Type {
	void color()
	{
		System.out.println("Apple is Red color");
	}
}