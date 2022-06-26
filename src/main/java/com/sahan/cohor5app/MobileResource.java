package com.sahan.cohor5app;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.google.gson.Gson;
import com.sahan.cohor5app.dao.MobileDao;
import com.sahan.cohor5app.model.Mobile;

@Path("mobile")
public class MobileResource {
	
	private Logger logger = LogManager.getLogger(MobileResource.class);
	
	private Gson gson = new Gson();
	/**
	 * Fetch all the mobiles.
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		
		logger.fatal("THIS IS A FATAL");
		logger.error("THIS IS A ERROR");
		logger.warn("THIS IS A WARN");
		logger.info("THIS IS A INFO");
		logger.debug("THIS IS A DEBUG");
		logger.trace("THIS IS A TRACE");
		
		MobileDao mobileDao = new MobileDao();
		List<Mobile> mobiles = mobileDao.getAllMobiles();

		String jsonString = gson.toJson(mobiles);
		
		return Response
				.status(200)
				.entity(jsonString)
				.build();
	}
	
	@Path("{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getItem(@PathParam("id") int id) {
		MobileDao mobileDao = new MobileDao();
		Mobile mobile = mobileDao.getAMobile(id);
		
		if (mobile != null) {
			String jsonString = gson.toJson(mobile);
			return Response
					.status(200)
					.entity(jsonString)
					.build();
		} else {
			Map<String,String> msg = new HashMap<String, String>();
			msg.put("MESSAGE", "Please enter valid ID.");
			String jsonString = gson.toJson(msg);
			return Response 
					.status(200)
					.entity(jsonString)
					.build();
		}
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response addItem(String jsonData) {
		
		Gson gson = new Gson();
		Mobile mobile = gson.fromJson(jsonData, Mobile.class);
		
		MobileDao mobileDao = new MobileDao();
		int response =  mobileDao.addMobile(mobile);
		
		Map<String,String> msg = new HashMap<String, String>();
		if (response > 0) {
			msg.put("MESSAGE", "Data added successfully");
		}else {
			msg.put("MESSAGE", "Invaild data!");
		}
		
		String jsonString = gson.toJson(msg);
		
		return Response
				.status(200)
				.entity(jsonString)
				.build();
		
	}
	

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response updateItem(String jsonData) {
		return null;
	}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteItem(String jsonData) {
		return null;
	}
	
}
