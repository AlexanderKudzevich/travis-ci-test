package me.pavekovt.travisci.contollers;

import me.pavekovt.travisci.contollers.exchange.CreateNewVehicleRequest;
import me.pavekovt.travisci.models.Vehicle;
import me.pavekovt.travisci.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

  @Autowired
  private VehicleService vehicleService;

  @GetMapping(value = "/{number}")
  public Vehicle getCar(@PathVariable(value = "number") String number) {
    return vehicleService.findByNumberPlate(number);
  }

  @PostMapping
  public Vehicle createCar(@RequestBody CreateNewVehicleRequest request) {
    return vehicleService.addNewVehicle(request.getModel(), request.getNumberPlate());
  }
}
