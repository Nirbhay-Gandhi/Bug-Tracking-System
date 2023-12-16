package daoInterface;

import model.User;

public interface DaoIntf {

	void saveUser(User u);
	
	User getUserById(String id);
	User getUserByName(String name);
	User getUserByEmail(String email);
	
}
