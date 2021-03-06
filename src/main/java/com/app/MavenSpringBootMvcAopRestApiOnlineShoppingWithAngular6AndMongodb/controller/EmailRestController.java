package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IEmailDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.Email;

@RestController
@RequestMapping("/api/email")
public class EmailRestController {
	
	@Autowired
	private IEmailDAO emailDAO;
	
	@PostMapping("/send")
	public ResponseEntity<Email> callSendEmail(@RequestBody Email email) throws Exception {
		emailDAO.sendEmail(email);
		return new ResponseEntity<Email>(email, HttpStatus.OK);
	}	
}
