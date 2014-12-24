
package uk.gov.identity;

import javax.jws.WebService;

@WebService(endpointInterface = "uk.gov.identity.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

