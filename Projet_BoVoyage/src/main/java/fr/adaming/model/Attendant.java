package fr.adaming.model;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
//Save values dans la même table
@DiscriminatorValue(value="Attendant")
@Entity
public class Attendant extends Person {
	
	@ManyToMany(mappedBy="attendants")
	private List<Trip> trips;

	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}
	
}
