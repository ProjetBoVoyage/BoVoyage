package fr.adaming.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "accommodations")
@SuppressWarnings("serial")
public class Accommodation  implements Serializable{

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

	// Constructors
	public Accommodation() {
		super();
	}

	public Accommodation(String name, double price, byte[] photo) {
		super();
		this.name = name;
		this.price = price;
		this.photo = photo;
	}

	public Accommodation(int idAcc, String name, double price, byte[] photo) {
		super();
		this.idAcc = idAcc;
		this.name = name;
		this.price = price;
		this.photo = photo;
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

	// To String
	@Override
	public String toString() {
		return "Accommodation [idAcc=" + idAcc + ", name=" + name + ", price=" + price + ", photo="
				+ Arrays.toString(photo) + ", img=" + img + "]";
	}
	
	
	
}
