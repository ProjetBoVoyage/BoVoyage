package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "insurances")
@SuppressWarnings("serial")
public class Insurance  implements Serializable{
	
	// Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_insu")
	private int idInsu;
	private String name;
	private double price; 
	private String type;
	
	// Constructors
	public Insurance() {
		super();
	}
	public Insurance(String name, double price, String type) {
		super();
		this.name = name;
		this.price = price;
		this.type = type;
	}
	public Insurance(int idInsu, String name, double price, String type) {
		super();
		this.idInsu = idInsu;
		this.name = name;
		this.price = price;
		this.type = type;
	}
	
	// Getters & Setters
	public int getIdInsu() {
		return idInsu;
	}
	public void setIdInsu(int idInsu) {
		this.idInsu = idInsu;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "You chose the "+type+" insurance "+name + " at the cost of " + price + " euros";
	} 
	
	
	
	

}
