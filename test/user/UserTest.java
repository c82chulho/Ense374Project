package user;

import junit.framework.TestCase;

public class UserTest extends TestCase {

	User u1 = new User();
	User u2;
	UserList UList = new UserList();

	
	public void testUserListInsert(){
		u1.setID(1);
		u1.setAddress("somewhere");
		u1.setMembership(true);
		u1.setMembershipExpiration("2014/12/01");
		u1.setName("user one");
		
		UList.addUser(u1);
	}
	public void testUserListSearch(){
		u2 = UList.searchByID(1);
	}	
	
	public void testUserListRemove(){
		u2 = UList.searchByID(1);
		
		UList.removeUser(u2.getID());
	}	
}
