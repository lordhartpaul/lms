package org.hcl.com.service;

import org.hcl.com.dao.LmsDao;
import org.hcl.com.entity.Leaves;
import org.hcl.com.entity.Manager;
import org.hcl.com.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LmsServiceImpl implements LmsService {
	
	@Autowired
	private LmsDao lmsDao;

	@Override
	public String addUser(User user) {
		
		return lmsDao.addUser(user);
	}

	@Override
	public Leaves userLeaveDetails() {
	
		return lmsDao.userLeaveDetails();
	}

	@Override
	public String addManager(Manager manager) {
		
		return lmsDao.addManager(manager);
	}

	@Override
	public String addUserLeave(Leaves leaves) {
		
		return lmsDao.addUserLeave(leaves);
	}

}
