package Abstraction;
import java.util.Scanner;
public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
Student st=new Student();
st.totalmark();

	}

}
abstract class rank {
	abstract void totalmark();
	public void rank1() {
		System.out.println("Rank 2");
		
	}
}
class Student extends rank {
	void totalmark() {
		System.out.println("Total mark-> 455");
	}
}
