package com.transport.railTicket;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/ticket")
public class RailTicketService {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String pnrStatus(@QueryParam("pnrNo")String pnrNo){
		return this.hashCode()+"";
	}
}
