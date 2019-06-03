package de.stutengarten.telegram;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class TelegramBotInitializer {
	
	public static void initializeBot() {
		ApiContextInitializer.init();
		TelegramBotsApi botsApi = new TelegramBotsApi();

		try {

			StutengartenBot bot = new StutengartenBot();

			botsApi.registerBot(bot);

			System.out.println("Bot started");
			
		} catch (TelegramApiException e) {
			System.err.println("Unable to start telegram bot");

		}
	}
}
