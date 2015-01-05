package hello;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 03/01/2015
 * Time: 18:55
 */

@RestController
public class VehicleController {
    
    @RequestMapping(value = "/vehicle")
    public ResponseEntity<Vehicle> get() {
     
        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Volvo");
        vehicle.setModel("Station Wagon");
        vehicle.setRegistrationNo("BUZ WAGN");
        vehicle.setDateOfReg("10/08/1984");
        vehicle.setOwner("Stefan Cross");
        
        return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<Vehicle> update(@RequestBody Vehicle vehicle) {
        return new ResponseEntity<Vehicle>(vehicle, HttpStatus.OK);
    }
    
}
