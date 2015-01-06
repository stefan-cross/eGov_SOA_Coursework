package uk.egov.identity;

/**
 * Created with IntelliJ IDEA.
 * User: stefancross
 * Date: 05/01/2015
 * Time: 21:46
 */
public interface IAddress {
    
    public Address getAddress(Integer number, String postcode);

    public void setAddress(Integer number, String address1, String address2, String county, String postcode, String country);
    
}
