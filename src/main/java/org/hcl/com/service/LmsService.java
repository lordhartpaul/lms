package org.hcl.com.service;

import org.hcl.com.entity.Leaves;
import org.hcl.com.entity.Manager;
import org.hcl.com.entity.User;

public interface LmsService {

	public String addUser(User user);
	
	public Leaves userLeaveDetails();
	
	public String addUserLeave(Leaves leaves);
	
	public String addManager(Manager manager);

}
