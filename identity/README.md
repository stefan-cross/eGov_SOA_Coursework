Identity SOAP Service
=====================

This time we are building using a contract last approach as the various IDE wizards are failing!

mvn archetype:generate -Dfilter=org.apache.cxf.archetype:
    
    [INFO] ----------------------------------------------------------------------------
    [INFO] Using following parameters for creating project from Archetype: cxf-jaxws-javafirst:3.0.0
    [INFO] ----------------------------------------------------------------------------
    [INFO] Parameter: groupId, Value: egov
    [INFO] Parameter: artifactId, Value: identity
    [INFO] Parameter: version, Value: 1
    [INFO] Parameter: package, Value: uk.egov.identity
    [INFO] Parameter: packageInPathFormat, Value: uk/egov/identity
    [INFO] Parameter: package, Value: uk.egov.identity
    [INFO] Parameter: version, Value: 1
    [INFO] Parameter: groupId, Value: egov
    [INFO] Parameter: artifactId, Value: identity
    [INFO] project created from Archetype in dir: /Users/stefancross/Programming/java/SOA_Coursework/eGov_SOA_Coursework/identity
    [INFO] ------------------------------------------------------------------------
    [INFO] BUILD SUCCESS
    [INFO] ------------------------------------------------------------------------
    [INFO] Total time: 40.584 s
    [INFO] Finished at: 2015-01-05T20:55:10+00:00
    [INFO] Final Memory: 16M/182M
    [INFO] ------------------------------------------------------------------------


To deploy:
----------

    mvn clean install tomcat:run-war 

Look for "Running war on http://xxx" and "Setting the server's publish address to be /yyy" in console output; WSDL browser address will be
concatenation of the two: http://xxx/yyy?wsdl


TODO:
http://cxf.apache.org/docs/annotations.html
http://cxf.apache.org/docs/ws-security.html
try from previous contract first in VM to see code generation working