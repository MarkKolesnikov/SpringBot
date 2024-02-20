package com.project.SpringTGBot.config;

import com.project.SpringTGBot.CounterTelegramBot;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Initializer {
    @Autowired
    CounterTelegramBot bot;

    @EventListener({ContextRefreshedEvent.class})
    public void 
}
