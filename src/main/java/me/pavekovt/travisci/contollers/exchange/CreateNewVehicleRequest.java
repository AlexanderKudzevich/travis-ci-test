package me.pavekovt.travisci.contollers.exchange;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateNewVehicleRequest {
  private String numberPlate;
  private String model;

  @JsonCreator
  public CreateNewVehicleRequest(
      @JsonProperty("numberPlate") String numberPlate,
      @JsonProperty("model") String model
  ) {
    this.numberPlate = numberPlate;
    this.model = model;
  }

  public String getNumberPlate() {
    return numberPlate;
  }

  public String getModel() {
    return model;
  }
}
