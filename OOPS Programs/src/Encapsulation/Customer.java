package Encapsulation;

public class Customer {
String name;
String address;
String contactno;
String email;
String prooftype;
String proofid;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getContactno() {
	return contactno;
}
public void setContactno(String contactno) {
	this.contactno = contactno;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getProoftype() {
	return prooftype;
}
public void setProoftype(String prooftype) {
	this.prooftype = prooftype;
}
public String getProofid() {
	return proofid;
}
public void setProofid(String proofid) {
	this.proofid = proofid;
}

public void register() {
	System.out.println("Name       " +   getName());
	
	System.out.println("Address    " +   getAddress());
	
	System.out.println("Contactno  " +   getContactno());
	
	System.out.println("Email      " +   getEmail());
	
	System.out.println("Prooftype  " +   getProoftype());
	
	System.out.println("Proofid    " +   getProofid());
	
	
}		
			
			
}
