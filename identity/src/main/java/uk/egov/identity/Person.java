package uk.egov.identity;

import uk.egov.identity.Person;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 05/01/2015
 * Time: 21:36
 */

@WebService(endpointInterface = "uk.egov.identity.IPerson")
public class Person implements IPerson{

    private String uniqueRef;
    private String previousRef;
    private Title title;
    private String name;
    private String surname;
    private String DOB;
    private Address primaryAddress;
    private String MPNHome;
    private String MPNMobile;
    private String email;
    private String nextOfKin;

    public String getUniqueRef() {
        return this.uniqueRef;
    }

    public void setUniqueRef(String uniqueRef) {
        this.uniqueRef = uniqueRef;
    }

    public String getPreviousRef() {
        return this.previousRef;
    }

    public void setPreviousRef(String previousRef) {
        this.previousRef = previousRef;
    }

    public Title getTitle() {
        return this.title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDOB() {
        return this.DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Address getPrimaryAddress() {
        return this.primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public String getMPNHome() {
        return this.MPNHome;
    }

    public void setMPNHome(String MPNHome) {
        this.MPNHome = MPNHome;
    }

    public String getMPNMobile() {
        return this.MPNMobile;
    }

    public void setMPNMobile(String MPNMobile) {
        this.MPNMobile = MPNMobile;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNextOfKin() {
        return this.nextOfKin;
    }

    public void setNextOfKin(String nextOfKin) {
        this.nextOfKin = nextOfKin;
    }
    
    @Override
    public Person getPerson(String uid) {

        this.uniqueRef = uid;
        this.previousRef = uid;
        this.name = "Stefan";
        this.surname = "Cross";
        this.DOB = "10/08/1984";
        this.primaryAddress = new Address().getAddress(10, "EC1 1C0");
        this.MPNHome = "012345781321";
        this.MPNMobile = "+44123321123";
        this.email = "me@scross.com";
        this.nextOfKin = "uid123321";
        
        return this;
    }

    @Override
    public Person setPerson(String uniqueRef, String previousRef, Title title, String name, String surname, String DOB, Address primaryAddress, String MPNHome, String MPNMobile, String email, String nextOfKin) {
        
        this.setUniqueRef(uniqueRef);
        this.setPreviousRef(previousRef);
        this.setTitle(title);
        this.setName(name);
        this.setSurname(surname);
        this.setDOB(DOB);
        this.setPrimaryAddress(new Address().getAddress(10, "EC1 1C0"));
        this.setMPNHome(MPNHome);
        this.setMPNMobile(MPNMobile);
        this.setEmail(email);
        this.setNextOfKin(nextOfKin);
        
        return this;

    }
}
