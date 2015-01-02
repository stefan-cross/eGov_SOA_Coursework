package uk.egov.health;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 02/01/2015
 * Time: 15:59
 */

@WebService
public interface Appointment {

    AppointmentImpl getRecord(String ref);
    
}
