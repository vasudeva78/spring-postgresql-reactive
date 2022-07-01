package com.reactive.spring.postgresql.validation.impl;

import com.reactive.spring.postgresql.validation.CustomerAddressConstraint;
import org.apache.commons.lang3.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CustomerAddressConstraintImpl
    implements ConstraintValidator<CustomerAddressConstraint, String> {
  @Override
  public boolean isValid(
      String customerAddress, ConstraintValidatorContext constraintValidatorContext) {
    if (StringUtils.isEmpty(customerAddress) == false) return true;
    return false;
  }
}
