package com.project.SpringTGBot.components;

import org.telegram.telegrambots.meta.api.objects.commands.BotCommand;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.List;

public interface BotCommands {
    List<BotCommand> LIST_OF_COMMANDS = List.of(
        new BotCommand("/start", "Start bot"),
            new BotCommand("/help", "bot info")
    );

    String HELP_TEXT = "This bot will help to count the number of messages in the chat. " +
            "the following commands are available: \n" +
            "/start - start bot \n" +
            "/help - help menu";
}
