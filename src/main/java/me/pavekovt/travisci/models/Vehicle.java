package me.pavekovt.travisci.models;

public class Vehicle {
  private int id;

  private String model;
  private String numberPlate;

  public int getId() {
    return id;
  }

  public String getModel() {
    return model;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getNumberPlate() {
    return numberPlate;
  }

  public void setNumberPlate(String numberPlate) {
    this.numberPlate = numberPlate;
  }
}
