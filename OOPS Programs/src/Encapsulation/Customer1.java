package Encapsulation;

public class Customer1 {
String name;
String address;
String contactno;
String email;
String prooftype;
String proofid;
public String getName() {
	return this. name;
}

public boolean setName(String name) {
	if(name.matches("^[a-zA-Z]*$"))
	{
	this.name = name;
	return true;
}
else
{
	
	return false;
	}
}
public String getAddress() {
	return address;
}
public boolean setAddress(String address) {
	if(address.matches("^[a-zA-Z0-9-]*$")) {
	this.address = address;
	return true;
}
else
{
	
	return false;
}
}
public String getContactno() {
	return contactno;
}
public boolean setContactno(String contactno) {
	if(contactno.matches("^[0-9]*$"))
			{
	this.contactno = contactno;
	return true;
}
else
{
	
	return false;
}
}
public String getEmail() {
	return email;
}
public boolean setEmail(String email) {
	if(email.contains("@"))
	{
	this.email = email;
	return true;
}

else
{
	
	return false;
}
}
	public String getProoftype() {
		return prooftype;
	}
public boolean setProoftype(String prooftype) {
	if(prooftype.matches("^[a-zA-Z]*$"))
	{
	this.prooftype = prooftype;
	return true;
}
else
{
	
}
	return false;
}
public String getProofid() {
	return proofid;
}
public boolean setProofid(String proofid) {
	
	if(proofid.matches("^[0-9]*$"))
	{
	this.proofid = proofid;
			return true;
	}
	else
	{
		
	
	return false;
	
	}
}

public void display(String name,String address,String contactno,String email,String prooftype,String proofid) {
	int a[]=new int[25];
	int i=1;
	System.out.println("Your Details");
	System.out.println("name");
	System.out.println("address");
	System.out.println("contactno");
 System.out.println("email");
 System.out.println("prooftype");
 System.out.println("proofid");
 System.out.println("Your id is "+i);
 i++;
 
}
}
