package ma.pavekovt.travisci;

import static org.assertj.core.api.Java6Assertions.assertThat;

import me.pavekovt.travisci.models.Vehicle;
import org.junit.Test;

public class VehicleTests {

  @Test
  public void vehicleHasCorrectModelSet() {
    final String expectedModel = "Skoda";

    Vehicle vehicle = new Vehicle();
    vehicle.setModel(expectedModel);

    assertThat(vehicle.getModel())
        .isEqualTo(expectedModel);
  }

  @Test
  public void vehicleHasCorrectNumberSet() {
    final String expectedNumber = "GL-3698";

    Vehicle vehicle = new Vehicle();
    vehicle.setNumberPlate(expectedNumber);

    assertThat(vehicle.getNumberPlate())
        .isEqualTo(expectedNumber);
  }
}
