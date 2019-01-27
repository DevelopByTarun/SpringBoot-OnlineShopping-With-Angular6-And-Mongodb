package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.dao.IUserDAO;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal.User;
import com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.repository.UserRepository;

@Service
public class UserService implements IUserDAO {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public boolean addUser(User user) throws Exception {
		// TODO Auto-generated method stub
		return userRepository.save(user) != null;
	}

	@Override
	public User doLogin(User user) throws Exception {
		// TODO Auto-generated method stub
		Query loginQuery = new Query();
		loginQuery.fields().include("id");
		loginQuery.fields().include("username");
		loginQuery.fields().include("password");
		loginQuery.fields().include("fullName");
		loginQuery.fields().include("email");
		loginQuery.fields().include("address");
		loginQuery.fields().include("city");
		loginQuery.fields().include("state");
		loginQuery.fields().include("zip");
		loginQuery.fields().include("mobileNumber");
		loginQuery.fields().include("cardHolderName");
		loginQuery.fields().include("cardNumber");
		loginQuery.fields().include("cardExpiryMonth");
		loginQuery.fields().include("cardExpiryYear");
		loginQuery.fields().include("cvvNumber");
		loginQuery.addCriteria(Criteria.where("username").is(user.getUsername()).and("password").is(user.getPassword()));
		User checkUser = mongoTemplate.findOne(loginQuery, User.class);
		return checkUser;
	}	
	
	@Override
	public void updateUser(User user) throws Exception {
		// TODO Auto-generated method stub
		User getUser = mongoTemplate.findById(user.getId(), User.class);
		getUser.setUsername(user.getUsername());
		getUser.setPassword(user.getPassword());
		getUser.setFullName(user.getFullName());
		getUser.setEmail(user.getEmail());
		getUser.setMobileNumber(user.getMobileNumber());
		getUser.setAddress(user.getAddress());
		getUser.setCity(user.getCity());
		getUser.setState(user.getState());
		getUser.setZip(user.getZip());
		getUser.setCardHolderName(user.getCardHolderName());
		getUser.setCardNumber(user.getCardNumber());
		getUser.setCardExpiryMonth(user.getCardExpiryMonth());
		getUser.setCardExpiryYear(user.getCardExpiryYear());
		getUser.setCvvNumber(user.getCvvNumber());
		mongoTemplate.save(getUser);
	}

	@Override
	public User getUser(String id) throws Exception {
		// TODO Auto-generated method stub
		User userById = mongoTemplate.findById(id, User.class);
		return userById;
	}
}
