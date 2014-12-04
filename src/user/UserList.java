package user;

import java.util.Vector;

public class UserList {
private int numbOfUsers;
private Vector<User> listOfUsers = new Vector<User>();

public Vector<User> getListOfUsers() {
	return listOfUsers;
}

public void setListOfUsers(Vector<User> listOfUsers) {
	this.listOfUsers = listOfUsers;
}

public int getNumbOfUsers() {
	return numbOfUsers;
}

public void setNumbOfUsers(int numbOfUsers) {
	this.numbOfUsers = numbOfUsers;
}
public User searchByID(int ID)
{
	User temp = new User();
	for (int i=0;i<listOfUsers.size();i++)
	{
		if( listOfUsers.get(i).getID()==ID)
		{
			temp = listOfUsers.get(i);
		}
	}
	return temp;
}
public User searchByName(String aName)
{
	for (int i=0;i<listOfUsers.size();i++)
	{
		if( listOfUsers.get(i).getName()==aName)
		{
			System.out.println("The user is in the system");
			return listOfUsers.get(i);
		}
	}
	System.out.println("The user is not in the system");
	return null;
}
public void addUser(User newUser)
{
	listOfUsers.addElement(newUser);
}
public void removeUser(int userID)
{
	for(int i=0;i<listOfUsers.size();i++)
	{
		if(listOfUsers.get(i).getID()==userID)
		{
			listOfUsers.remove(i);
		}
	}
}
}
