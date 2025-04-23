package com.example;

import am.ik.yavi.arguments.Arguments3Validator;
import am.ik.yavi.core.Validated;
import am.ik.yavi.validator.Yavi;

public final class Car {

  private static Arguments3Validator<String, String, Integer, Car> validator = Yavi.arguments()
      ._string("manufacturer", c -> c.notNull())
      ._string("licensePlate", c -> c.notNull().greaterThanOrEqual(2).lessThanOrEqual(14))
      ._integer("seatCount", c -> c.greaterThanOrEqual(2))
      .apply(Car::new);

  private final String manufacturer;

  private final String licensePlate;

  private final Integer seatCount;

  public static Validated<Car> of(String manufacturer, String licensePlate, Integer seatCount) {
    return validator.validate(manufacturer, licensePlate, seatCount);
  }

  private Car(String manufacturer, String licensePlate, Integer seatCount) {
    this.manufacturer = manufacturer;
    this.licensePlate = licensePlate;
    this.seatCount = seatCount;
  }

  public String manufacturer() {
    return manufacturer;
  }

  public String licensePlate() {
    return licensePlate;
  }

  public Integer seatCount() {
    return seatCount;
  }

  @Override public String toString() {
    return "Car{" +
           "manufacturer='" + manufacturer + '\'' +
           ", licensePlate='" + licensePlate + '\'' +
           ", seatCount=" + seatCount +
           '}';
  }
}