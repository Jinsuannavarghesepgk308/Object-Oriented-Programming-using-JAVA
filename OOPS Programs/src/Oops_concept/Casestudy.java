package Oops_concept;
import java.util.Scanner;
public class Casestudy {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		Customer c=new Customer();
		Display d=new Display();
		System.out.println("Enter the name");
		c.setName(s.next());
		System.out.println("Enter the address");
		c.setAddress(s.next());
		System.out.println("Enter the contactno");
		c.setContactno(s.next());
		System.out.println("Enter the email");
		c.setEmail(s.next());
		System.out.println("Enter the prooftype");
		c.setProoftype(s.next());
		System.out.println("Enter the proofid");
		c.setProofid(s.next());
		
				c.register();
				d.display(c.getName(),c.getAddress(),c.getContactno(),c.getEmail(),c.getProoftype(),c.getProofid());
				System.out.println("Thank you for registering.Your id is 1..");
				
		
				
				
	}

}
