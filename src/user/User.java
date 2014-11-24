package user;

public class User {
private String name;
private String address;
private int ID;
private boolean membership;
private String membershipExpiration;
public User()
{
	name="";
	address="";
	ID=-1;
	membership=false;
	membershipExpiration="";
}
public String getName()
{
	return name;
}
public void setName(String aname)
{
	name=aname;
}
public String getAddress()
{
	return address;
}
public void setAddress(String anAdress)
{
	address=anAdress;
}
public int getID()
{
	return ID;
}
public void setID(int anID)
{
	ID=anID;
}
public boolean getMembership()
{
	return membership;
}
public void setMembership(boolean mem)
{
membership=mem;	
}

public String getMembershipExpiration()
{
	return membershipExpiration;
}
public void setMembershipExpiration(String newExpiration)
{
	membershipExpiration=newExpiration;
}
}