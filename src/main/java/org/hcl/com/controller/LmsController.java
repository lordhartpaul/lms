package org.hcl.com.controller;

import org.hcl.com.entity.Leaves;
import org.hcl.com.entity.Manager;
import org.hcl.com.entity.User;
import org.hcl.com.service.LmsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is LMS controller class containing leave management methods
 * 
 * @author Pallavi Shishodia
 * @Version 1.0
 * 
 * **/

@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class LmsController {

	private static final Logger LOGGER = LoggerFactory.getLogger(LmsController.class);

	@Autowired
	private LmsService lmsService;

	/**
	 * 
	 * @param empty
	 * @return ResponseEntity leave details
	 * @throws 
	 * 
	 */
	
	@RequestMapping(value = "/getUserLeaveDetails", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Leaves> getUserLeaveDetails() {

		LOGGER.info("getUserLeaveDetails Method in lmsController started");
		ResponseEntity<Leaves> repsponse = new  ResponseEntity<Leaves>(lmsService.userLeaveDetails(), HttpStatus.OK);
		System.out.println("response"+repsponse);
		return repsponse;
	}
	
	/**
	 * @param User
	 * @return String
	 * @throws 
	 * 
	 */
	@RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addUser(User user) {
		LOGGER.info("addUser Method in lmsController started");
		return lmsService.addUser(user);
	}

	/**
	 * @param Manager
	 * @return String
	 * @throws 
	 * 
	 */
	@RequestMapping(value = "/addManager", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addManager(Manager manager) {
		LOGGER.info("addManager Method in lmsController started");
		return lmsService.addManager(manager);
	}
	
	/**
	 * @param Leave 
	 * @return String
	 * @throws 
	 * 
	 */
	@RequestMapping(value = "/addLeave", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public String addLeave(Leaves leaves) {
		LOGGER.info("addLeave Method in lmsController started");
		return lmsService.addUserLeave(leaves);
	}
}