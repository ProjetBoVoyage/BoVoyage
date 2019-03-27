package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="roles")
public class Role implements Serializable {

	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_r")
	private int idRole;
	private String roleName;
	
	// Transformation de l'association UML en Java
	@ManyToOne
	@JoinColumn(name="ad_id",referencedColumnName="id_ad")
	private Admin admin;
	
	@ManyToOne
	@JoinColumn(name="cus_id",referencedColumnName="id_cus")
	private Customer customer;
	
	@ManyToOne
	@JoinColumn(name="co_id",referencedColumnName="id_co")
	private Counsellor counsellor;
	

	// Constructeur
	public Role() {
		super();
	}

	public Role(int idRole, String roleName, Admin admin) {
		super();
		this.idRole = idRole;
		this.roleName = roleName;
		this.admin = admin;
	}

	public Role(String roleName, Admin admin) {
		super();
		this.roleName = roleName;
		this.admin = admin;
	}
	
	// Getters & Setters
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Counsellor getCounsellor() {
		return counsellor;
	}

	public void setCounsellor(Counsellor counsellor) {
		this.counsellor = counsellor;
	}

	
	
}