package com.atmecs.dto;



public class EntryResponse {
	
	public String cust_name;
	public String flight_name;
	public String category;
	public String source;
	public int ticket_id;
	public EntryResponse(String cust_name, String flight_name, String category, String source,int ticket_id) {
		super();
		this.cust_name = cust_name;
		this.flight_name = flight_name;
		this.category = category;
		this.source = source;
		this.ticket_id=ticket_id;
	}
	
	public EntryResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
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
	public int getTicket_id() {
		return ticket_id;
	}
	public void setTicket_id(int ticket_id) {
		this.ticket_id = ticket_id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}

}
