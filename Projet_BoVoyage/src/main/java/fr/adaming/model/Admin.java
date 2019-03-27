package fr.adaming.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
//Save values dans la même table
@DiscriminatorValue(value="Admin")
public class Admin extends Person {

	// Attributes
	@Column(name="mdp_ad")
	private String mdpAd;
	
	private boolean active;

	@OneToMany(mappedBy="admin")
	private List<Role> roles;
	
	// Constructors
	public Admin() {
		super();
	}

	public Admin(int id, String mail, String mdpAd) {
		super(id, mail);
		this.mdpAd = mdpAd;
	}

	public Admin(String mail, String mdpAd) {
		super(mail);
		this.mdpAd = mdpAd;
	}

	// Getters & Setters
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


	
}
