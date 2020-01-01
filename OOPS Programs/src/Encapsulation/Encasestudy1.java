package Encapsulation;
import java.util.Scanner;

public class Encasestudy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		Customer1 c=new Customer1();
		Display1 d=new Display1();
		do {
		System.out.println("Enter the number");
		int n=s.nextInt();
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
		if(c.getName()==null)
		{
			System.out.println("Invalid name");
		}
		if(c.getAddress()==null)
		{
			System.out.println("Invalid address");
		}
		if(c.getContactno()==null)
		{
			System.out.println("Invalid contactno");
		}
		if(c.getEmail()==null)
		{
			System.out.println("Invalid email");
		}
		if(c.getProoftype()==null)
		{
			System.out.println("Invalid prooftype");
		}
		if(c.getProofid()==null)
		{
			System.out.println("Invalid proofid");
		}
		
		}
		while(c.getName()==null ||c.getAddress()==null ||c.getContactno()==null ||c.getEmail()==null ||c.getProoftype()==null ||c.getProofid()==null);
		if(c.getName()!=null && c.getAddress()!=null &&c.getContactno()!=null &&c.getEmail()!=null && c.getProoftype()!=null && c.getProofid()!=null) {
		
d.display(c.getName(),c.getAddress(),c.getContactno(),c.getEmail(),c.getProoftype(),c.getProofid());
		}
}
	}
		