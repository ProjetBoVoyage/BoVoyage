package fr.adaming.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "accommodations")
@SuppressWarnings("serial")
public class Accommodation implements Serializable {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_acc")
	private int idAcc;
	private String name;
	private double price;
	@Lob
	private byte[] photo;
	@Transient
	private String img;
	private int quantity;

	// UML To Java Association's Transformation
	@OneToMany(mappedBy = "accomodation", cascade = { CascadeType.REMOVE, CascadeType.PERSIST })
	private List<FormulaTrip> formulaTrips;

	// Constructors
	public Accommodation() {
		super();
	}

	public Accommodation(String name, double price, byte[] photo, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.photo = photo;
		this.quantity = quantity;
	}

	public Accommodation(int idAcc, String name, double price, byte[] photo, int quantity) {
		super();
		this.idAcc = idAcc;
		this.name = name;
		this.price = price;
		this.photo = photo;
		this.quantity = quantity;
	}

	// Getters & Setters
	public int getIdAcc() {
		return idAcc;
	}

	public void setIdAcc(int idAcc) {
		this.idAcc = idAcc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public List<FormulaTrip> getFormulaTrips() {
		return formulaTrips;
	}

	public void setFormulaTrips(List<FormulaTrip> formulaTrips) {
		this.formulaTrips = formulaTrips;
	}

	// To String
	@Override
	public String toString() {
		return "Accommodation [idAcc=" + idAcc + ", name=" + name + ", price=" + price + ", photo="
				+ Arrays.toString(photo) + ", img=" + img + "]";
	}

}
