package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
@Table(name = "customers")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="function") 
public class Person implements Serializable {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cus")
	protected int idCus;
	protected String name;
	protected String firstName;
	protected String civility;
	protected String phone;
	protected String mail;
	@Temporal(TemporalType.DATE)
	protected Date dob;
	
	// UML to Java Association's Transformation
	@Embedded
	protected Address address;
	
	// Constructors
	public Person() {
		super();
	}

	public Person(String name, String firstName, String civility, String phone, String mail, Date dob,
			Address address) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.civility = civility;
		this.phone = phone;
		this.mail = mail;
		this.dob = dob;
		this.address = address;
	}


	public Person(int idCus, String name, String firstName, String civility, String phone, String mail, Date dob,
			Address address) {
		super();
		this.idCus = idCus;
		this.name = name;
		this.firstName = firstName;
		this.civility = civility;
		this.phone = phone;
		this.mail = mail;
		this.dob = dob;
		this.address = address;
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
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}	
