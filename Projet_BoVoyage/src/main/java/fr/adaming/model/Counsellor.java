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

	@OneToMany(mappedBy="admin")
	private List<Role> roles;

}
