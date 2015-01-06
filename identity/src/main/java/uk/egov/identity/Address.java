package uk.egov.identity;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 05/01/2015
 * Time: 21:43
 */

public class Address implements IAddress {

    private static int number;
    private static String address1;
    private static String address2;
    private static String county;
    private static String postcode;
    private static String country;


    @Override
    public Address getAddress(Integer number, String postcode) {
        
        this.number = number;
        this.address1 = "Downing Street";
        this.address2 = "Westminster";
        this.county = "London";
        this.postcode = postcode;
        this.country = "Great Britain";
        
        return this;
    }

    @Override
    public void setAddress(Integer number, String address1, String address2, String county, String postcode, String country) {
        this.number = number;
        this.address1 = address1;
        this.address2 = address2;
        this.county = county;
        this.postcode = postcode;
        this.country = country;
    }
}
