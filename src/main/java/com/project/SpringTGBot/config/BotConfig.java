package com.project.SpringTGBot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Data
@PropertySource("classpath:config.properties")
public class BotConfig {
    @org.springframework.beans.factory.annotation.Value("${bot.name}")
    private String botName;

    @org.springframework.beans.factory.annotation.Value("${bot.token}")
    private String token;

    @Value("${bot.chatId}")
    private String chatId;
}