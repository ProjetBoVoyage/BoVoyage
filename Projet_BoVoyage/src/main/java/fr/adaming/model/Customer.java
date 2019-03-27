package fr.adaming.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@DiscriminatorValue(value = "Customer")
public class Customer extends Attendant {

	// Attributes
	@Column(name="mdp_cus")
	private String mdpCus;
	private boolean active;
	
	@Embedded
	protected Address address;
	
	@OneToMany(mappedBy="customer", cascade= {CascadeType.REMOVE, CascadeType.PERSIST})
	private List<Trip> trips;
	
	@OneToMany(mappedBy="customer")
	private List<Role> roles;

	// Constructors
	public Customer() {
		super();
	}

	
	public Customer(int id, String mail, String name, String firstname, String civility, Date dob, String phone,
			String mdpCus, Address address) {
		super(id, mail, name, firstname, civility, dob, phone);
		this.mdpCus = mdpCus;
		this.address = address;
	}

	public Customer(String mail, String name, String firstname, String civility, Date dob, String phone, String mdpCus,
			Address address) {
		super(mail, name, firstname, civility, dob, phone);
		this.mdpCus = mdpCus;
		this.address = address;
	}


	// Getters & Setters
	

	public boolean isActive() {
		return active;
	}

	public String getMdpCus() {
		return mdpCus;
	}


	public void setMdpCus(String mdpCus) {
		this.mdpCus = mdpCus;
	}


	public void setActive(boolean active) {
		this.active = active;
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

	// To String
	@Override
	public String toString() {
		return "Customer [mdpCus=" + mdpCus + ", active=" + active + ", address=" + address + ", trips=" + trips
				+ ", roles=" + roles + "]";
	}





	
	
	

}
