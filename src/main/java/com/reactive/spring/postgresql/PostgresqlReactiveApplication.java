package com.reactive.spring.postgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.reactive.spring.postgresql")
public class PostgresqlReactiveApplication {

  public static void main(String[] args) {
    SpringApplication.run(PostgresqlReactiveApplication.class, args);
  }
}
