package domain;

import java.util.ArrayList;
import java.util.List;

public class Role extends Entity  {

	public Role()
	{
		users=new ArrayList<User>();
		privileges = new ArrayList<Privilege>();
	}
	
	private String name;
	private List<User> users;
	private List<Privilege> privileges;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public List<Privilege> getPrivileges() {
		return privileges;
	}
	public void setPrivileges(List<Privilege> privileges) {
		this.privileges = privileges;
	}
	
	
}
