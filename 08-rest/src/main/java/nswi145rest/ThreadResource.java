package nswi145rest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;
import jakarta.xml.bind.JAXBElement;

@Path("/thread")
public class ThreadResource {
	private static Map<Integer, Thread> threads = new HashMap<Integer, Thread>();
	private UriInfo uri;
	
	public ThreadResource(@Context UriInfo uri) {
		this.uri = uri;
		threads.put(1, new Thread(1, "Hello everyone", 23));
		threads.put(2, new Thread(2, "Changes to the ranking system", 42));
	}

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Path("{id}")
	public Response getThread(@PathParam("id") String threadId) {
		int id;
		try {
			id = Integer.parseInt(threadId);
		} catch(Exception e) {
			return Response.status(400).entity(threadId).build();
		}
		
		if (!threads.containsKey(id)) {
			return Response.status(404).entity(id).build();
		}
		
		return Response.status(200).entity(threads.get(id)).build();
	}
	
	@DELETE
	@Produces({MediaType.TEXT_PLAIN})
	@Path("{id}")
	public Response deleteThread(@PathParam("id") String threadId) {
		int id;
		try {
			id = Integer.parseInt(threadId);
		} catch(Exception e) {
			return Response.status(400).entity(threadId).build();
		}
		
		if (!threads.containsKey(id)) {
			return Response.status(404).entity(id).build();
		}
		
		threads.remove(id);
		return Response.status(204).build();
	}
	

	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<Thread> getThreads() {
		List<Thread> returnedThreads = new ArrayList<Thread>();
		returnedThreads.addAll(threads.values());
		return returnedThreads;
	}
	

	@PUT
	@Consumes(MediaType.APPLICATION_XML)
	@Produces({MediaType.TEXT_PLAIN})
	@Path("{id}")
	public Response putThread(@PathParam("id") String threadId, JAXBElement<Thread> threadElement) {
		int id;
		try {
			id = Integer.parseInt(threadId);
		} catch(Exception e) {
			return Response.status(400).entity(threadId).build();
		}
		
		if (!threads.containsKey(id)) {
			return Response.status(404).entity(id).build();
		}

		Thread thread = threadElement.getValue();
		if (thread.getId() != id) {
			return Response.status(409).entity("ids don't match").build();
		}
		
		threads.put(id, thread);
		
		return Response.status(204).build();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_XML)
	@Produces({MediaType.TEXT_PLAIN})
	public Response postThread(JAXBElement<Thread> threadElement) {
		Thread thread = threadElement.getValue();
		if (threads.containsKey(thread.getId())) {
			return Response.status(409).entity(thread.getId()).build();
		}
		
		threads.put(thread.getId(), thread);
		
		return Response.status(201).entity(uri.getAbsolutePath().resolve(thread.getId() + "")).build();
	}
}
