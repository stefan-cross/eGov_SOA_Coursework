package uk.egov.health;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    
    String foo();
}

