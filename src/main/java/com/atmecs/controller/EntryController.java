package com.atmecs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.atmecs.dto.CustomResponse;
import com.atmecs.dto.EntryRequest;
import com.atmecs.dto.EntryResponse;
import com.atmecs.entity.Flight;
import com.atmecs.entity.Ticket;
import com.atmecs.repository.FlightRepository;
import com.atmecs.repository.TicketRepository;

@RestController
public class EntryController {

	@Autowired
	private FlightRepository flightRepository;

	@Autowired
	private TicketRepository ticketRepository;
	
	@GetMapping("/")
	public String home() {
		return "Welcome To My Home Page";
	}

	@PostMapping("/saveEntry")
	public Flight saveEntry(@RequestBody EntryRequest request) {
		return flightRepository.save(request.getFlight());
	}

	@GetMapping("/allEntry")
	public List<Flight> findAllEntries() {

		return flightRepository.findAll();
	}

	@GetMapping("/joinInfo")
	public List<EntryResponse> getJoinInfo() {

		return flightRepository.getJoinInfo();
	}

	@GetMapping("/getAllFlights")
	public List<Flight> getAllFlights() {
		return flightRepository.getAllFlights();
	}

	@GetMapping("/getFlightByName")
	public HashMap<String, String> getFlightByName() {
		List<String> flight_names = flightRepository.getFlightByName();
		HashMap<String , String> data = new HashMap<>();

		for (int i = 0; i < flight_names.size(); i++) {
			
			int c=i+1;
			
			data.put("flight_name"+c, flight_names.get(i));
			
			System.out.println(flight_names.get(i));
		}
		
		return data;
	}
	@GetMapping("/getAllTickets")
	public List<Ticket> getAllTickets(){
		return ticketRepository.getAllTickets();
	}
	@GetMapping("/getAllTicketIdName")
	public List<CustomResponse> getAllTicketIdName(){
		
		
		return ticketRepository.getAllTicketIdName();
	}
}
