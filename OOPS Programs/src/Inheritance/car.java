package Inheritance;

import java.util.Scanner;

public class car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int a=s.nextInt();
Car2 c=new Car2();
c.about();
c.speed(a);
	}
}

class Car1
{
	void about()
	{
	System.out.println("enter the model");
	
}
}
class Car2 extends Car1 
{
	void speed(int a)
	{
		System.out.println(speed);
	}
}
