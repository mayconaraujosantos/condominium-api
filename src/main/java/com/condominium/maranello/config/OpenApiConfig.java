package com.condominium.maranello.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

  private static final String TITLE = "condominium";
  private static final String VERSION = "1.0.0";
  private static final String EMAIL = "maycon.araujo.santos@gmail.com";
  private static final String NAME = "mayconaraujosantos";

  @Bean
  public OpenAPI customOApi() {
    return new OpenAPI().info(new Info().title(TITLE).version(VERSION).contact(
        new Contact().email(EMAIL).name(NAME)));
  }
}
