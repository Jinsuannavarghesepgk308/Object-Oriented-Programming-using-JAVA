package Encapsulation;

import java.util.Scanner;

public class Casestudy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int person;
		int totaldays;
		double tarriff;
		Scanner s=new Scanner(System.in);
		System.out.println("Booking");
		System.out.println("Enter the no of persons: ");
		int a=s.nextInt();
		System.out.println("Enter the no of days: ");
		int b=s.nextInt();
		System.out.println("Enter the room type: ");
		String AC=s.next();
		System.out.println("enter the tariff for single person: ");
		int c=s.nextInt();
		Peak st=new Peak();
		Lean ls=new Lean();
		double sd=ls.Book(a,b,c);
		System.out.println("month");
		int m=s.nextInt();
		switch(m) {
	case 4:
	case 5:
	case 6:
	case 9:
	case 11:
	case 12:
		 st.peak(sd);
		break;
	case 1:
	case 2:
	case 3:
	case 7:
	case 8:
	case 10:
	ls.lean(sd);
		break;
	
		}
	}

}

class Bookk {
	double total;
	double Book(int a,int b,double c) {
		total=a*b*c;
		return total;
	}
}
class Peak extends Bookk {
	double total1;
	void peak(double sd) {
		total1=sd+500;
		System.out.println("Total Tariff:"+total1);
	}
}
class Lean extends Bookk {
	double total2;
	void lean(double sd) {
		total2=sd-500;
		System.out.println("Total Tariff:"+total2);
		}
	
	}
