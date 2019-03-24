package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
//import javax.ws.rs.ApplicationPath;
//import javax.ws.rs.core.*;

@Path("/hello")
public class Hello {
	
//	@GET
//	@Produces(MediaType.TEXT_XML)
//	public String sayHelloXml() 
//	{
//		String resource=" <? xml version='1.0' ?> " + "<hello> Hello Neil this is from xml </hello>";
//		return resource; 
//	}
//	
//	@GET
//	@Produces(MediaType.APPLICATION_JSON)
//	public String sayHelloJson() 
//	{
//		String resource=null;
//		return resource; 
//	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHtml(@QueryParam("name") String name, @QueryParam("card_no") String card_no, @QueryParam("amount") int amount) 
	{
		System.out.println("Name: " + name);
		System.out.println("card no: " + card_no);
		System.out.println("Amt: " + amount);
		String response;
		
		if(amount > 10000) {
			System.out.println("amount is greater than 10000 lakh");
			response = name + " your credit card is not approved";
		} else {
			System.out.println("amount is less than 10000 lakh");
			response = name + " your credit card is approved";
		}
		return "<html>" + "<title>" + "Credit Card Auth for " + name + "</title>" +  "<body><h1>" + response + "</h1></body>" +  "</html>";
		 
	}

}
