package com.atmecs.dto;

import com.atmecs.entity.Flight;

public class EntryRequest {
	
	private Flight flight;

	@Override
	public String toString() {
		return "EntryRequest [flight=" + flight + "]";
	}

	public EntryRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public EntryRequest(Flight flight) {
		super();
		this.flight = flight;
	}

}
