package de.stutengarten.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.google.gson.Gson;

import de.propro.backend.dijkstra.Dijkstra;
import de.propro.backend.dijkstra.DijkstraOneToAllResult;

@Path("/telegram")
public class API {

	/**
	 * 
	 * Handles a request for the one to all Dijkstra. You can either pass a nodeID
	 * 
	 * @param nodeID    The index of the node to start from
	 * @param latitude  The latitude of the coordinate. It's not required that the
	 *                  latitude is a valid coordinate of a node.
	 * @param longitude The latitude of the coordinate. It's not required that the
	 *                  latitude is a valid coordinate of a node.
	 * @return The processing time and the distance to all nodes from the start node
	 */
	@GET
	@Path("message")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response oneToAllDijkstra(String message) {

		ResponseBuilder response = null;
		Dijkstra dijkstra = null;
		DijkstraOneToAllResult dResult = null;
		Response output = null;
		Gson jsonHandler = new Gson();


		return output;
	}

}
