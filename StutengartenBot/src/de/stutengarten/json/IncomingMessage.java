package de.stutengarten.json;

/**
 * 
 * This class is used as wrapper class for the json library to convert the
 * message string of the message endpoint into an java object
 * 
 * @author schieljn
 *
 */
public class IncomingMessage {
	public String token;
	public int rights;
	public String message;
}
