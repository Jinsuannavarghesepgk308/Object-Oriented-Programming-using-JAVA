package Inheritance;

import java.util.Scanner;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);

 Model m=new Model();
 Audi b=new Audi();
 int a=s.nextInt();
 m.about();
 
 m.color();
 
 b.speed(a);
 
	}

}
class  sap{
	void about()
	{
		System.out.println("2018 model");
	}
}
class Audi extends  sap{
	void speed(int a)
	{
		
		System.out.println(a);
	}
}
class Model extends Audi {
	void color()
	{
		System.out.println("Black");
	}
}