package com.reactive.spring.postgresql.validation.impl;

import com.reactive.spring.postgresql.validation.CustomerNameConstraint;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomerNameConstraintImpl
    implements ConstraintValidator<CustomerNameConstraint, String> {
  @Override
  public boolean isValid(
      String customerName, ConstraintValidatorContext constraintValidatorContext) {
    if (StringUtils.isEmpty(customerName) == false) return true;
    return false;
  }
}
