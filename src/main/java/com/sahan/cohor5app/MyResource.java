package com.sahan.cohor5app;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */

@Path("sample")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public String postIt() {
    	return "Hello from the post method.";
    }
    
    @PUT
    @Produces(MediaType.TEXT_HTML)
    public String putRequest() {
    	return "<h3>Hello for the PUT request</h3>";
    }
    
    @DELETE
    @Produces(MediaType.TEXT_HTML)
    public String deleteRequest() {
    	return "<h3>Hello for the DELETE request</h3>";
    }
    
    
}
