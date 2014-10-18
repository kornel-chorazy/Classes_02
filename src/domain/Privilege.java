package domain;

import java.util.ArrayList;
import java.util.List;

public class Privilege extends Entity  {

	public Privilege()
	{
		setRoles(new ArrayList<Role>());
	}
	
	public List<Role> getRoles() {
		return roles;
	}
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;
	private List<Role> roles;
}
