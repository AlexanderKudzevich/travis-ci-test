package me.pavekovt.travisci.repositories;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import me.pavekovt.travisci.models.Vehicle;
import org.springframework.stereotype.Service;

@Service
public class VehicleRepository {
  private final List<Vehicle> vehicles = new ArrayList<>();
  private final AtomicInteger integer = new AtomicInteger();

  public Vehicle save(Vehicle vehicle) {
    int id = integer.getAndAdd(1);
    vehicle.setId(id);
    vehicles.add(vehicle);
    return vehicle;
  }

  public Vehicle findByNumberPlate(String numberPlate) {
    Vehicle vehicle = vehicles.stream()
        .filter(v -> v.getNumberPlate().equals(numberPlate))
        .findFirst()
        .get();

    return vehicle;
  }
}
