package com.challenge.dto;

import java.math.BigDecimal;
import java.util.List;

import javax.validation.constraints.NotNull;

public class OrderDto {

  @NotNull
  private List<MealDto> meals;

  @NotNull
  private BigDecimal totalCost;

  @NotNull
  private String address;

  @NotNull
  private LocationDto location;

  @NotNull
  private String restaurantMail;

  @NotNull
  private String phoneNumber;

  public OrderDto() {
    super();
  }

  public List<MealDto> getMeals() {
    return meals;
  }

  public void setMeals(List<MealDto> meals) {
    this.meals = meals;
  }

  public BigDecimal getTotalCost() {
    return totalCost;
  }

  public String getAddress() {
    return address;
  }

  public LocationDto getLocation() {
    return location;
  }

  public String getRestaurantMail() {
    return restaurantMail;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

}
