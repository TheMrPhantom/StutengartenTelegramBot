package de.stutengarten.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

import com.google.gson.Gson;

import de.stutengarten.json.IncomingMessage;
import de.stutengarten.telegram.TelegramBotInitializer;

@Path("/telegram")
public class API {

	/**
	 * 
	 * TODO
	 * 
	 */
	@GET
	@Path("message")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response oneToAllDijkstra(String message) {

		Gson json = new Gson();
		IncomingMessage incMessage = json.fromJson(message, IncomingMessage.class);

		/*
		 * ResponseBuilder response = null; Dijkstra dijkstra = null;
		 * DijkstraOneToAllResult dResult = null; Response output = null; Gson
		 * jsonHandler = new Gson();
		 * 
		 * return output;
		 */
		return null;
	}

	/**
	 * 
	 * HTTP call for starting the telegram bot. The bot will be be able to send
	 * Messages until this method is called. You are anyway able to send message
	 * requests, these will be send after the bot is started
	 * 
	 * @return 200 If bot started, 500 else
	 */
	@GET
	@Path("start")
	public Response startBot() {

		ResponseBuilder response = null;
		try {
			TelegramBotInitializer.initializeBot();
			response = Response.ok();
		} catch (TelegramApiRequestException e) {
			response = Response.status(500);
		}

		return response.build();
	}
}
