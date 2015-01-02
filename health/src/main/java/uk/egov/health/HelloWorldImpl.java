
package uk.egov.health;

import javax.jws.WebService;

@WebService(endpointInterface = "uk.egov.health.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
    
    public String foo() {return "bar";}
}

