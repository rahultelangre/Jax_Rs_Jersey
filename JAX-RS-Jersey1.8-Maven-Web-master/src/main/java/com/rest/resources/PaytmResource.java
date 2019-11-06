package com.rest.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/paytm")
public class PaytmResource {

	@GET
	public String getWalletBalance() {
		// business logic
		return "<h1>Balnace : 500.00</h1>";
	}
}
