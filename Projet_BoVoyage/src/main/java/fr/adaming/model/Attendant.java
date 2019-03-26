package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@SuppressWarnings("serial")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
//Save values dans la même table
@DiscriminatorColumn(name="function") 
// Colonne qui distingue les objets mères et filles dans le tab unique
@DiscriminatorValue(value="Attend")
public class Attendant implements Serializable {

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
	
	// UML to Java Association's Transformation
	@Embedded
	@OneToOne
	@JoinColumn(name="add_id", referencedColumnName="id_add")
	protected Address address;
	
	@ManyToMany(mappedBy="attendants")
	private List<Trip> trips;
	// Constructors
	public Attendant() {
		super();
	}
	
	public Attendant(String name, String firstName, String civility, String phone, String mail) {
		super();
		this.name = name;
		this.firstName = firstName;
		this.civility = civility;
		this.phone = phone;
		this.mail = mail;
	}
	
	public Attendant(int idCus, String name, String firstName, String civility, String phone, String mail) {
		super();
		this.idCus = idCus;
		this.name = name;
		this.firstName = firstName;
		this.civility = civility;
		this.phone = phone;
		this.mail = mail;
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
	
}
