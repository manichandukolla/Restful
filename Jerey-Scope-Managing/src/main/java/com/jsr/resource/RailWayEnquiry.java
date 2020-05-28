package com.jsr.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/enquiry")
public class RailWayEnquiry {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
  public String  getTicketStatus(@QueryParam("pnrNo")int pnrNo) {
	  return "conformed"+this.hashCode();
  }
  
  
}
