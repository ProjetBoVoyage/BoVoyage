package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@Entity
public class ReservationFile implements Serializable {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_rf")
	private int id;
	private String status;

	@OneToMany(mappedBy = "reservationFile", cascade = { CascadeType.REMOVE, CascadeType.PERSIST })
	private List<Trip> tripsRf;

	public ReservationFile() {
		super();
	}

	public ReservationFile(String status, List<Trip> trips) {
		super();
		this.status = status;
		this.tripsRf = trips;
	}

	public ReservationFile(int id, String status, List<Trip> trips) {
		super();
		this.id = id;
		this.status = status;
		this.tripsRf = trips;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Trip> getTrips() {
		return tripsRf;
	}

	public void setTrips(List<Trip> tripsRf) {
		this.tripsRf = tripsRf;
	}

}
