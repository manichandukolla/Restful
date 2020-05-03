package com.jfa.resource;

import javax.print.attribute.standard.Media;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.message.internal.MediaTypes;

@Path( "plan")
public class PlanResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
  public String  getPlanDetails(@QueryParam("planNo") int planNo) {
	return "the plan details"+ planNo;
	  
  }
}
