package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="admins")
public class Admin implements Serializable{

	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ad")
	private int idAd;
	
	@Column(name="mail_ad")
	private String mailAd;
	
	@Column(name="mdp_ad")
	private String mdpAd;
	
	private boolean active;

	@OneToMany(mappedBy="admin")
	private List<Role> roles;
	
	// Constructors
	public Admin() {
		super();
	}

	public Admin(String mailAd, String mdpAd, boolean active, List<Role> roles) {
		super();
		this.mailAd = mailAd;
		this.mdpAd = mdpAd;
		this.active = active;
		this.roles = roles;
	}

	public Admin(int idAd, String mailAd, String mdpAd, boolean active, List<Role> roles) {
		super();
		this.idAd = idAd;
		this.mailAd = mailAd;
		this.mdpAd = mdpAd;
		this.active = active;
		this.roles = roles;
	}

	// Getters & Setters
	public int getIdAd() {
		return idAd;
	}

	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}

	public String getMailAd() {
		return mailAd;
	}

	public void setMailAd(String mailAd) {
		this.mailAd = mailAd;
	}

	public String getMdpAd() {
		return mdpAd;
	}

	public void setMdpAd(String mdpAd) {
		this.mdpAd = mdpAd;
	}
	
	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "Your administrator's email: " + mailAd;
	}
	
}
