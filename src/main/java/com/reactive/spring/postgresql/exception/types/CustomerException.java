package com.reactive.spring.postgresql.exception.types;

import lombok.*;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CustomerException extends RuntimeException {
  private String errorCode;
  private String message;
  private String correlationid;
}
