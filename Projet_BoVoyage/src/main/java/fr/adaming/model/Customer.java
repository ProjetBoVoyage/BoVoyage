package fr.adaming.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@DiscriminatorValue(value = "Custo")
public class Customer extends Person {

	// Attributes
	private String password;
	
	@OneToMany(mappedBy="customer", cascade= {CascadeType.REMOVE, CascadeType.PERSIST})
	private List<Trip> trips;
	
	@OneToMany(mappedBy="customer")
	private List<Role> roles;

	// Constructors
	public Customer() {
		super();
	}

	

	public Customer(String name, String firstName, String civility, String phone, String mail, Date dob,
			Address address, String password, List<Trip> trips, List<Role> roles) {
		super(name, firstName, civility, phone, mail, dob, address);
		this.password = password;
		this.trips = trips;
		this.roles = roles;
	}



	public Customer(int idCus, String name, String firstName, String civility, String phone, String mail, Date dob,
			Address address, String password, List<Trip> trips, List<Role> roles) {
		super(idCus, name, firstName, civility, phone, mail, dob, address);
		this.password = password;
		this.trips = trips;
		this.roles = roles;
	}



	// Getters & Setters
	public int getIdCus() {
		return idCus;
	}

	public void setIdCus(int idCus) {
		this.idCus = idCus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getCivility() {
		return civility;
	}

	public void setCivility(String civility) {
		this.civility = civility;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}
	
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
	
	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}


	// To String
	@Override
	public String toString() {
		return "Customer [password=" + password + ", trips=" + trips + ", roles=" + roles + ", idCus=" + idCus
				+ ", name=" + name + ", firstName=" + firstName + ", civility=" + civility + ", phone=" + phone
				+ ", mail=" + mail + ", dob=" + dob + ", address=" + address + "]";
	}



}
