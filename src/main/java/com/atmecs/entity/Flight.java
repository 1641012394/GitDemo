package com.atmecs.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Flight {
	@Id
	@GeneratedValue
	private int flight_id;
	private String flight_name;
	private String category;
	private boolean isFoodAvailable;
	
	@OneToMany(targetEntity = Ticket.class,cascade = CascadeType.ALL)
	@JoinColumn(name="ft_fk",referencedColumnName = "flight_id")
	private List<Ticket> tickets;

	public Flight(String flight_name, String category, boolean isFoodAvailable, List<Ticket> tickets) {
		super();
		
		this.flight_name = flight_name;
		this.category = category;
		this.isFoodAvailable = isFoodAvailable;
		this.tickets = tickets;
	}

	public int getFlight_id() {
		return flight_id;
	}

	public void setFlight_id(int flight_id) {
		this.flight_id = flight_id;
	}

	public String getFlight_name() {
		return flight_name;
	}

	public void setFlight_name(String flight_name) {
		this.flight_name = flight_name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isFoodAvailable() {
		return isFoodAvailable;
	}

	public void setFoodAvailable(boolean isFoodAvailable) {
		this.isFoodAvailable = isFoodAvailable;
	}

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}
	


}
