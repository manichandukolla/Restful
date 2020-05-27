package com.resteasyimpl.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/plan")
public class PlanResource {
	@GET
    @Produces(MediaType.TEXT_PLAIN)
  public String getPlanDetails(@QueryParam("planNo")int planNo) {
  return "planNo :"+ this.hashCode();
  }
}
