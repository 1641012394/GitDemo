package com.atmecs.dto;

public class CustomResponse {
	
	public int ticket_id;
	public String cust_name;
	public CustomResponse(int ticket_id, String cust_name) {
		super();
		this.ticket_id = ticket_id;
		this.cust_name = cust_name;
	}
	public CustomResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
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
	@Override
	public String toString() {
		return "CustomResponse [ticket_id=" + ticket_id + ", cust_name=" + cust_name + "]";
	}
	

}
