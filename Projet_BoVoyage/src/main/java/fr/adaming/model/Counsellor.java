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
@Table(name="counsellors")
public class Counsellor implements Serializable {
	
	// Attributes
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_co")
	private int idCo;
	
	@Column(name="mail_co")
	private String mailCo;
	
	@Column(name="mdp_co")
	private String mdpCo;
	
	private boolean active;

	@OneToMany(mappedBy="counsellor")
	private List<Role> roles;

	
	// Constructors
	public Counsellor() {
		super();
	}

	public Counsellor(String mailCo, String mdpCo, boolean active, List<Role> roles) {
		super();
		this.mailCo = mailCo;
		this.mdpCo = mdpCo;
		this.active = active;
		this.roles = roles;
	}

	public Counsellor(int idCo, String mailCo, String mdpCo, boolean active, List<Role> roles) {
		super();
		this.idCo = idCo;
		this.mailCo = mailCo;
		this.mdpCo = mdpCo;
		this.active = active;
		this.roles = roles;
	}

	// Getters & Setters
	public int getIdCo() {
		return idCo;
	}

	public void setIdCo(int idCo) {
		this.idCo = idCo;
	}

	public String getMailCo() {
		return mailCo;
	}

	public void setMailCo(String mailCo) {
		this.mailCo = mailCo;
	}

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
