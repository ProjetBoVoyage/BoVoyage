package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "formulastrip")
public class FormulaTrip implements Serializable {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_formtrip")
	private int id;
	private String nameFormTrip;
	private double rate;

	// UML To Java Association's Transformation
	@ManyToOne
	@JoinColumn(name = "acc_id", referencedColumnName = "id_acc")
	private Accommodation accomodation;
	@ManyToOne
	@JoinColumn(name = "dest_id", referencedColumnName = "id_dest")
	private Destination destination;
	@ManyToOne
	@JoinColumn(name = "id_formacc", referencedColumnName = "formacc_id")
	private FormulaAccomodation formulaAccomodation;
	@ManyToOne
	@JoinColumn(name = "id_insu", referencedColumnName = "insu_id")
	private Insurance insurance;
	@OneToOne
	@JoinColumn(name="trip_id",referencedColumnName="id_trip")
	private Trip trip;

	// Constructors
	public FormulaTrip() {
		super();
	}

	public FormulaTrip(String nameFormTrip, double rate, Accommodation accomodation, Destination destination,
			FormulaAccomodation formulaAccomodation, Insurance insurance) {
		super();
		this.nameFormTrip = nameFormTrip;
		this.rate = rate;
		this.accomodation = accomodation;
		this.destination = destination;
		this.formulaAccomodation = formulaAccomodation;
		this.insurance = insurance;
	}

	public FormulaTrip(int id, String nameFormTrip, double rate, Accommodation accomodation, Destination destination,
			FormulaAccomodation formulaAccomodation, Insurance insurance) {
		super();
		this.id = id;
		this.nameFormTrip = nameFormTrip;
		this.rate = rate;
		this.accomodation = accomodation;
		this.destination = destination;
		this.formulaAccomodation = formulaAccomodation;
		this.insurance = insurance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameFormTrip() {
		return nameFormTrip;
	}

	public void setNameFormTrip(String nameFormTrip) {
		this.nameFormTrip = nameFormTrip;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Accommodation getAccomodation() {
		return accomodation;
	}

	public void setAccomodation(Accommodation accomodation) {
		this.accomodation = accomodation;
	}

	public Destination getDestination() {
		return destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public FormulaAccomodation getFormulaAccomodation() {
		return formulaAccomodation;
	}

	public void setFormulaAccomodation(FormulaAccomodation formulaAccomodation) {
		this.formulaAccomodation = formulaAccomodation;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}

	@Override
	public String toString() {
		return "FormulaTrip [id=" + id + ", nameFormTrip=" + nameFormTrip + ", rate=" + rate + ", accomodation="
				+ accomodation + ", destination=" + destination + ", formulaAccomodation=" + formulaAccomodation
				+ ", insurance=" + insurance + "]";
	}

}
