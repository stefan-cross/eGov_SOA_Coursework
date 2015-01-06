package uk.egov.identity;

import javax.jws.WebService;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 05/01/2015
 * Time: 21:52
 */

@WebService
public interface IPerson {

    public Person getPerson(String uid);

    public Person setPerson(String uniqueRef, String previousRef, Title title, String name,
                          String surname, String DOB, Address primaryAddress, 
                          String MPNHome, String MPNMobile, String email, 
                          String nextOfKin);
}
