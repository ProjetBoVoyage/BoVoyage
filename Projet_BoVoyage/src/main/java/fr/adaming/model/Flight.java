package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Flight implements Serializable {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_flight")
	private int idFlight;
	private String departureAirport;
	private String arrivalAirport;
	@Temporal(TemporalType.DATE)
	private Date departureDate;
	@Temporal(TemporalType.DATE)
	private Date arrivalDate;
	@Temporal(TemporalType.TIME)
	private Date departureTime;
	@Temporal(TemporalType.TIME)
	private Date arrivalTime;
	private String company;
	private int quantity;

	// UML to Java Association's Transformation
	@OneToMany(mappedBy = "flight", cascade = { CascadeType.REMOVE, CascadeType.PERSIST })
	private List<FormulaTrip> formulaTrips;

	// Constructors
	public Flight() {
		super();
	}

	public Flight(String departureAirport, String arrivalAirport, Date departureDate, Date arrivalDate,
			Date departureTime, Date arrivalTime, String company, int quantity) {
		super();
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.company = company;
		this.quantity = quantity;
	}

	public Flight(int idFlight, String departureAirport, String arrivalAirport, Date departureDate, Date arrivalDate,
			Date departureTime, Date arrivalTime, String company, int quantity) {
		super();
		this.idFlight = idFlight;
		this.departureAirport = departureAirport;
		this.arrivalAirport = arrivalAirport;
		this.departureDate = departureDate;
		this.arrivalDate = arrivalDate;
		this.departureTime = departureTime;
		this.arrivalTime = arrivalTime;
		this.company = company;
		this.quantity = quantity;
	}

	// Getters & Setters
	public int getIdFlight() {
		return idFlight;
	}

	public void setIdFlight(int idFlight) {
		this.idFlight = idFlight;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getArrivalAirport() {
		return arrivalAirport;
	}

	public void setArrivalAirport(String arrivalAirport) {
		this.arrivalAirport = arrivalAirport;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public Date getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(Date arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
