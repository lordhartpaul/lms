package org.hcl.com.dao;

import org.hcl.com.entity.Leaves;
import org.hcl.com.entity.Manager;
import org.hcl.com.entity.User;

public interface LmsDao {

	public String addUser(User user);
	
	public String addManager(Manager manager);
	
	public String addUserLeave(Leaves leaves);
	
	public Leaves userLeaveDetails();	
	
}
