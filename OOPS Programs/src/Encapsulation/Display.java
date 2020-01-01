package Encapsulation;

public class Display extends Customer {
	public void display(String name,String address,String contacttype,String email,String prooftype,String proofid)
	{
		System.out.println("Details are ... ");
		System.out.println("Name      "    +name);
		System.out.println("Address   "    +address);
		System.out.println("Contactno "    +contactno);
		System.out.println("Email     "    +email);
		System.out.println("Prooftype "    +prooftype);
		System.out.println("Proofid   "    +proofid);
	}
}
