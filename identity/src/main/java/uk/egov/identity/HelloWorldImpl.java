
package uk.egov.identity;

import javax.jws.WebService;

@WebService(endpointInterface = "uk.egov.identity.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

