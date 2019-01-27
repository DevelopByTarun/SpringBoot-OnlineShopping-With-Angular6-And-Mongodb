package com.app.MavenSpringBootMvcAopRestApiOnlineShoppingWithAngular6AndMongodb.modal;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "E-CommerceApp_User")
@TypeAlias("user")
public class User {
		
	@Id
    private String id;
	
	@Field(value = "User_Username")
	private String username;
	
	@Field(value = "User_Password")
	private String password;
		
	@Field(value = "User_FullName")
	private String fullName;
	
	@Field(value = "User_Email")
	private String email;
	
	@Field(value = "User_Address")
	private String address;
	
	@Field(value = "User_City")
	private String city;
	
	@Field(value = "User_State")
	private String state;
	
	@Field(value = "User_Zip")
	private String zip;
	
	@Field(value = "User_MobileNumber")
	private String mobileNumber;
	
	@Field(value = "User_CardHolderName")
	private String cardHolderName;
	
	@Field(value = "User_CardNumber")
	private String cardNumber;
	
	@Field(value = "User_CardExpiryMonth")
	private String cardExpiryMonth;
	
	@Field(value = "User_CardExpiryYear")
	private String cardExpiryYear;
	
	@Field(value = "User_CvvNumber")
	private String cvvNumber;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}

	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}

	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	/**
	 * @return the cardNumber
	 */
	public String getCardNumber() {
		return cardNumber;
	}

	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	/**
	 * @return the cardExpiryMonth
	 */
	public String getCardExpiryMonth() {
		return cardExpiryMonth;
	}

	/**
	 * @param cardExpiryMonth the cardExpiryMonth to set
	 */
	public void setCardExpiryMonth(String cardExpiryMonth) {
		this.cardExpiryMonth = cardExpiryMonth;
	}

	/**
	 * @return the cardExpiryYear
	 */
	public String getCardExpiryYear() {
		return cardExpiryYear;
	}

	/**
	 * @param cardExpiryYear the cardExpiryYear to set
	 */
	public void setCardExpiryYear(String cardExpiryYear) {
		this.cardExpiryYear = cardExpiryYear;
	}

	/**
	 * @return the cvvNumber
	 */
	public String getCvvNumber() {
		return cvvNumber;
	}

	/**
	 * @param cvvNumber the cvvNumber to set
	 */
	public void setCvvNumber(String cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
}
