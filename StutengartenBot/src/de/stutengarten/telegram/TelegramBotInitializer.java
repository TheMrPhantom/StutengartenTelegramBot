package de.stutengarten.telegram;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class TelegramBotInitializer {

	private static boolean IS_STARTED = false;

	/**
	 * 
	 * Starts the TelegramBot
	 * 
	 * @throws TelegramApiRequestException If the bot could not be started
	 */
	public static void initializeBot() throws TelegramApiRequestException  {
		if (!IS_STARTED) {
			ApiContextInitializer.init();
			TelegramBotsApi botsApi = new TelegramBotsApi();

				StutengartenBot bot = new StutengartenBot();

				botsApi.registerBot(bot);

				System.out.println("Bot started");
				IS_STARTED = true;
			
		}
	}
}
