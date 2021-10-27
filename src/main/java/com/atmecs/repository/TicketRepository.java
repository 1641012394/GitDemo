package com.atmecs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.atmecs.dto.CustomResponse;
import com.atmecs.entity.Ticket;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {


	@Query(value = "select * from Ticket",nativeQuery = true)
	public List<Ticket> getAllTickets();
	
	@Query(value = "select new com.atmecs.dto.CustomResponse(t.ticket_id ,t.cust_name) from Ticket t")
	public List<CustomResponse> getAllTicketIdName();
	
	
	
}
