package com.atmecs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atmecs.dto.EntryResponse;
import com.atmecs.entity.Flight;


public interface FlightRepository extends JpaRepository<Flight, Integer> {

	@Query("select new com.atmecs.dto.EntryResponse( t.cust_name,f.flight_name,f.category,t.source,t.ticket_id) "
			+ "from Flight f join f.tickets t")
	public List<EntryResponse> getJoinInfo();
	
	@Query("select f from Flight f")
	public List<Flight> getAllFlights();
	
	
	 @Query(value = "select distinct flight_name from Flight",nativeQuery = true)
	public List<String> getFlightByName();
}
