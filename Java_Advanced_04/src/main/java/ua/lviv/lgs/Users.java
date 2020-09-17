package ua.lviv.lgs;

import java.util.ArrayList;

public class Users {

	private static ArrayList<User> users = null;
	private static Users thisUsers = null;
	
	private Users() {
		users = new ArrayList<>();
	}
	
	public static Users getUsers() {
		if(thisUsers == null) {
			thisUsers = new Users();
		}
		return thisUsers;
	}
	
	public void addUser(User user) {
		if(!users.contains(user))
			users.add(user);
	}

	public User getUserByEmail(String email) {	
		return users.stream().filter(user -> user.getEmail().equals(email)).findAny().get();
	}
	
	
	
}
