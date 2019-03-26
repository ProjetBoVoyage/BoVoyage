package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
@Table(name = "destinations")
public class Destination implements Serializable {

	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dest")
	private int idDest;

	private String continent;
	private String country;
	private String city;
	private Boolean available;

	@Column(name = "photo_dest")
	@Lob
	private byte[] photo;

	@Transient
	private String img;

	// Constructors
	public Destination() {
		super();
	}

	public Destination(String continent, String country, String city, Boolean available, byte[] photo, String img) {
		super();
		this.continent = continent;
		this.country = country;
		this.city = city;
		this.available = available;
		this.photo = photo;
		this.img = img;
	}

	public Destination(int idDest, String continent, String country, String city, Boolean available, byte[] photo,
			String img) {
		super();
		this.idDest = idDest;
		this.continent = continent;
		this.country = country;
		this.city = city;
		this.available = available;
		this.photo = photo;
		this.img = img;
	}

	// Getters & Setters
	public int getIdDest() {
		return idDest;
	}

	public void setIdDest(int idDest) {
		this.idDest = idDest;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
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

	@Override
	public String toString() {
		return "your destination: " + city + ", " + country;
	}

}
