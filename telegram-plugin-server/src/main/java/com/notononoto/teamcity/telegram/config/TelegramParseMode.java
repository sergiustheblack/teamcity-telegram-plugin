package com.notononoto.teamcity.telegram.config;

import com.pengrad.telegrambot.model.request.ParseMode;

import java.util.Optional;

public enum TelegramParseMode {
  NONE("None", null),
    // TODO: MarkdownV2 is very strict and not compatible with existing message templates
  //MarkdownV2("MarkdownV2", ParseMode.MarkdownV2),
  HTML("HTML", ParseMode.HTML);

  private final String name;
  private final ParseMode parseMode;

  TelegramParseMode(String name, ParseMode parseMode) {
    this.name = name;
    this.parseMode = parseMode;
  }

  public String getName() {
    return name;
  }

  public ParseMode getParseMode() {
    return parseMode;
  }

  public static Optional<TelegramParseMode> fromName(String name) {
    for (TelegramParseMode mode : TelegramParseMode.values()) {
      if (mode.name.equals(name)) {
        return Optional.of(mode);
      }
    }
    return Optional.empty();
  }
}
