package uk.egov.identity;

import javax.jws.WebService;

@WebService
public interface HelloWorld {
    String sayHi(String text);
}

