package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@DiscriminatorValue(value = "Counsellor")
public class Counsellor extends Person implements Serializable {
	
	// Attributes
	@Column(name="mdp_co")
	private String mdpCo;
	
	private boolean active;

	@OneToMany(mappedBy="counsellor")
	private List<Role> roles;

	
	// Constructors
	public Counsellor() {
		super();
	}


	public Counsellor(int id, String mail, String mdpCo) {
		super(id, mail);
		this.mdpCo = mdpCo;
	}


	public Counsellor(String mail, String mdpCo) {
		super(mail);
		this.mdpCo = mdpCo;
	}


	// Getters & Setters
	public String getMdpCo() {
		return mdpCo;
	}


	public void setMdpCo(String mdpCo) {
		this.mdpCo = mdpCo;
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
	