package me.pavekovt.travisci.services;

import me.pavekovt.travisci.models.Vehicle;
import me.pavekovt.travisci.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleService {

  @Autowired
  private VehicleRepository vehicleRepository;

  public Vehicle addNewVehicle(String model, String numberPlate) {
    Vehicle vehicle = new Vehicle();
    vehicle.setModel(model);
    vehicle.setNumberPlate(numberPlate);

    return vehicleRepository.save(vehicle);
  }

  public Vehicle findByNumberPlate(String numberPlate) {
    return vehicleRepository.findByNumberPlate(numberPlate);
  }
}
