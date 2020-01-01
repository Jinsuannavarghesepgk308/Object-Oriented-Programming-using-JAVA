package Inheritance;

import java.util.Scanner;

public class multilevelinheritance1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Comp c=new Comp();
		ab t=new ab();
		t.name();
		c.color();
		c.price(a);

			}

		}
		class ab  {
			void name()
			{
				System.out.println("DELL");
			}
		}
		class Lp extends ab {
			void color()
			{
				System.out.println("BLACK");
			}
		}
		class Comp extends Lp {
			void price(int a)
			{
				System.out.println(a);
			}
		}

	

}
