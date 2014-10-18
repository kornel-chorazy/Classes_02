import java.util.List;

import repositories.IRepositoryCatalog;
import repositories.impl.DummyRepositoryCatalog;
import domain.User;


public class Main {

	private static List<User> admins;

	public static void main(String[] args) {
		
		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		
		setAdmins(catalog.getUsers().withRole("administrator"));
		catalog.getUsers().add(new User());
		
	}

	public static List<User> getAdmins() {
		return admins;
	}

	public static void setAdmins(List<User> admins) {
		Main.admins = admins;
	}

}
