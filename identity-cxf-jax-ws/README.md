Identity CFX JAX-WS
===================

Work in progress...

We have build an mvn archetype apache cxf jax-ws project
    mvn archetype:generate -Dfilter=org.apache.cxf.archetype:

For now it is a simple helloworld app

You will need Apache Tomcat and Maven installed

Launch with:
    mvn clean install tomcat:run-war

View with:
    http://localhost:8080/identity-cxf-jax-ws/HelloWorld?wsdl

Test with:
    SOAPUI - SOAPUI/eGov-ID-Serivice-SOAPUI-Project.xml

Or Postman:
    http://localhost:8080/identity-cxf-jax-ws/HelloWorld

Request:
    <soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:iden="http://identity.gov.uk/">
       <soapenv:Header/>
       <soapenv:Body>
          <iden:sayHi>
             <!--Optional:-->
             <arg0>Dave</arg0>
          </iden:sayHi>
       </soapenv:Body>
    </soapenv:Envelope>

Reponse:
    <soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
       <soap:Body>
          <ns2:sayHiResponse xmlns:ns2="http://identity.gov.uk/">
             <return>Hello Dave</return>
          </ns2:sayHiResponse>
       </soap:Body>
    </soap:Envelope>

Next steps are to build a contract first service to preform CRUD operations on Identifier records