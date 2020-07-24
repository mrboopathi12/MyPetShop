package com.nix.mypet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
 
import javax.persistence.Table;
 
@Entity
@Table(name = "PET") 

public class Pet {
	
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "id")
 private Integer id;
 
 @Column(name = "pet_name")
 private String petName;
 
 @Column(name = "pet_price")
 private Integer petPrice;

@Override
public String toString() {
	return "Pet [id=" + id + ", petName=" + petName + ", petPrice=" + petPrice + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((id == null) ? 0 : id.hashCode());
	result = prime * result + ((petName == null) ? 0 : petName.hashCode());
	result = prime * result + ((petPrice == null) ? 0 : petPrice.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Pet other = (Pet) obj;
	if (id == null) {
		if (other.id != null)
			return false;
	} else if (!id.equals(other.id))
		return false;
	if (petName == null) {
		if (other.petName != null)
			return false;
	} else if (!petName.equals(other.petName))
		return false;
	if (petPrice == null) {
		if (other.petPrice != null)
			return false;
	} else if (!petPrice.equals(other.petPrice))
		return false;
	return true;
}

public String getPetName() {
	return petName;
}

public Integer getPetPrice() {
	return petPrice;
}

public void setPetName(String petName) {
	this.petName = petName;
}

public void setPetPrice(Integer petPrice) {
	this.petPrice = petPrice;
}

public Pet(  String petName, Integer petPrice) {
	super();
  	this.petName = petName;
	this.petPrice = petPrice;
}

public Pet() {
	
}
	 
}
