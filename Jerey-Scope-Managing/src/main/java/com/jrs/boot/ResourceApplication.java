package com.jrs.boot;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

import com.jsr.resource.RailWayEnquiry;
@ApplicationPath("/scope")
public class ResourceApplication  extends ResourceConfig{
  public ResourceApplication() {
	  register(new RailWayEnquiry());
  }
}
