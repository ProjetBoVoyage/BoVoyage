package fr.adaming.model;

import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ManyToMany;

@SuppressWarnings("serial")
//Save values dans la même table
@DiscriminatorColumn(name="function") 
// Colonne qui distingue les objets mères et filles dans le tab unique
@DiscriminatorValue(value="Attend")
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
