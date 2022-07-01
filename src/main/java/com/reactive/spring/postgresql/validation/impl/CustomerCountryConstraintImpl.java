package com.reactive.spring.postgresql.validation.impl;

import com.reactive.spring.postgresql.validation.CustomerCountryConstraint;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomerCountryConstraintImpl
    implements ConstraintValidator<CustomerCountryConstraint, String> {
  @Override
  public boolean isValid(
      String customerCountry, ConstraintValidatorContext constraintValidatorContext) {
    if (StringUtils.isEmpty(customerCountry) == false) return true;
    return false;
  }
}
