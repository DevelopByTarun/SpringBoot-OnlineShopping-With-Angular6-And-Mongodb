package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.User;

@RestController
@RequestMapping("/api/user")
public class UserRestController {
		
	@Autowired
	private IUserDAO userDAO;
	
	@PostMapping("/register")
	public ResponseEntity<Void> createProduct(@RequestBody User user, UriComponentsBuilder builder) throws Exception {
		boolean flag = userDAO.addUser(user);
		if(flag == false) {
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(builder.path("/register?id={id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	
	@RequestMapping("/login")
	public ResponseEntity<User> callDoLogin(@RequestBody User user) throws Exception {
		User userLogin = userDAO.doLogin(user);
		return new ResponseEntity<User>(userLogin, HttpStatus.OK);
	}
	
	@GetMapping("/logout")
	public ResponseEntity<User> signOut() throws Exception {
		return new ResponseEntity<User>(HttpStatus.OK);
	}
			
	@GetMapping("/edituser")
	public ResponseEntity<User> callGetUser(@RequestParam("id") String id) throws Exception {
		User user = userDAO.getUser(id);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@PostMapping("/updateuser")
	public ResponseEntity<User> callUpdateUser(@RequestBody User user) throws Exception {
		userDAO.updateUser(user);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}	
}
