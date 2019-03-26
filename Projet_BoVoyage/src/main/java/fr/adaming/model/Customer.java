package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
@SuppressWarnings("serial")
public class Customer implements Serializable {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cus")
	private int idCus;
	private String name;
	private String firstName;
	private String civility;
	private String phone;
	private String mail;
	private String password;

	@Embedded
	private Address address;

	// Constructors
	public Customer() {
		super();
	}

	public Customer(String name, String firstName, String civility, String phone, String mail, String password,
			Address address) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.civility = civility;
		this.phone = phone;
		this.mail = mail;
		this.password = password;
		this.address = address;
	}

	public Customer(int idCus, String name, String firstName, String civility, String phone, String mail,
			String password, Address address) {
		super();
		this.idCus = idCus;
		this.name = name;
		this.firstName = firstName;
		this.civility = civility;
		this.phone = phone;
		this.mail = mail;
		this.password = password;
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

	// To String
	@Override
	public String toString() {
		return "Customer [idCus=" + idCus + ", name=" + name + ", firstName=" + firstName + ", civility=" + civility
				+ ", phone=" + phone + ", mail=" + mail + ", password=" + password + ", address=" + address + "]";
	}

}
