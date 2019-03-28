package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class Cart implements Serializable {

	// Attibutes
	private List<Trip> trips;

	// Constructors
	public Cart() {
		super();
	}

	public Cart(List<Trip> trips) {
		super();
		this.trips = trips;
	}

	// Getters & Setters
	public List<Trip> getTrips() {
		return trips;
	}

	public void setTrips(List<Trip> trips) {
		this.trips = trips;
	}

}
