package de.stutengarten.telegram;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StutengartenBot extends TelegramLongPollingBot{

	@Override
	public void onUpdateReceived(Update update) {
		
	}

	@Override
	public String getBotUsername() {
		
		return null;
	}

	@Override
	public String getBotToken() {
		
		return null;
	}

}
