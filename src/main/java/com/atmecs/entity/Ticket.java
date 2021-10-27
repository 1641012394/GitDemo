package com.atmecs.entity;

import javax.persistence.Entity;

import javax.persistence.Id;

@Entity
public class Ticket {

	@Id
	private int ticket_id;
	private String cust_name;
	private String source;
	private String destination;
	private String flight_time;
	
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getFlight_time() {
		return flight_time;
	}
	public void setFlight_time(String flight_time) {
		this.flight_time = flight_time;
	}
	
	public Ticket(int ticket_id, String cust_name, String source, String destination, String flight_time) {
		super();
		this.ticket_id = ticket_id;
		this.cust_name = cust_name;
		this.source = source;
		this.destination = destination;
		this.flight_time = flight_time;
	}
	public Ticket() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
