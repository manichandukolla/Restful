package com.jfa.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/product")
public class ProductResource {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
public double getProductDetails(@QueryParam("product-No")String productNo) {
	return 33.3;
	
}
}
