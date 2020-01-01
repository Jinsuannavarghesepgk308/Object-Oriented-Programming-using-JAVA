package Abstraction;
import java.util.Scanner;
public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the name");
		String name=s.next();
		System.out.println("enter the id");
		int b=s.nextInt();
		System.out.println("enter the college");
		String a=s.next();
		System.out.println("enter the department");
		String c=s.next();
		Record sd=new Record();
        sd.details(name,b,a,c);
	}

}
abstract class Detail {
	abstract void details(String name,int b,String a,String c);
	public void Detail1() {
		System.out.println("Rank2");
		
	}
}
class Record extends Detail {
	void details(String name,int b,String a,String c) {
		System.out.println("name->"+name);
		System.out.println("id->"+b);
		System.out.println("college->"+a);
		System.out.println("department->"+c);
		super.Detail1();
	}
}
