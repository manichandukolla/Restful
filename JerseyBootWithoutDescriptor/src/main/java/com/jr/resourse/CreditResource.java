package com.jr.resourse;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/credit")
public class CreditResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
 public  String getCreditAmount(@QueryParam("amount")int amount) {
	 return "the amount is"+33;
 }
}
