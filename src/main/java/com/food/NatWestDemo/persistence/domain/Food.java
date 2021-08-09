  package com.food.NatWestDemo.persistence.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity

public class Food {@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column
	private String type;

	private String flavour;

	private boolean vegan;

	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Food(String type, String flavour, boolean vegan) {
		super();
		this.type = type;
		this.flavour = flavour;
		this.vegan = vegan;
	}

	public Food(Long id, String type, String flavour, boolean vegan) {
		super();
		Id = id;
		this.type = type;
		this.flavour = flavour;
		this.vegan = vegan;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public boolean isVegan() {
		return vegan;
	}

	public void setVegan(boolean vegan) {
		this.vegan = vegan;
	}
	@Override
	public String toString() {
		return "Food [Id=" + Id + ", type=" + type + ", flavour=" + flavour + ", vegan=" + vegan + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, type, flavour, vegan);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Food other = (Food) obj;
		return Objects.equals(Id, other.Id) && type == other.type && Objects.equals(flavour, other.flavour)
				&& Objects.equals(type, other.type);
	}
}
