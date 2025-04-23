package com.example;

import am.ik.yavi.core.ConstraintViolations;
import am.ik.yavi.core.Validated;

public class Main {
  public static void main(String[] args) {
    Validated<Car> carValidated = Car.of("Morris", "DD-AB-123", 1);
    if (carValidated.isValid()) {
      Car car = carValidated.value();
      System.out.println("Car created successfully! " + car);
    } else {
      System.out.println("Car creation failed!");
      ConstraintViolations violations = carValidated.errors();
      violations.forEach(violation -> {
        System.out.println(violation.message());
      });
    }
  }
}