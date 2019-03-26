package fr.adaming.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable 
@Access(AccessType.FIELD)
public class Address {
	// Attributes

	@Column(name="id_num")
	private int number;
	private String street;
	private String city;
	private String postalCode;
	
	// Constructors
	public Address() {
		super();
	}
	public Address(String street, String city, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}
	public Address(int number, String street, String city, String postalCode) {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.postalCode = postalCode;
	}
	
	//Getters & Setters
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	

	
}
