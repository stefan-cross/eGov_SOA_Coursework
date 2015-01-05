A simple Springboot REST service
================================

A very simple REST service to return a vehicle detail and also receive POST

    http://localhost:8080/vehicle

    opentuned:dropwizard-example stefancross$ curl -H "Content-Type: application/json" -X POST -d '{"registrationNo": "BUZ WAGN","dateOfReg": "10/08/1984","make": "Volvo","model": "Station Wagon","owner": "Stefan Cross"}' http://localhost:8080/register
    {"registrationNo":"BUZ WAGN","dateOfReg":"10/08/1984","make":"Volvo","model":"Station Wagon","owner":"Stefan Cross"}You have new mail in /var/mail/stefancross
    opentuned:dropwizard-example stefancross$ 

This is not meant to be anything more then this, just a simple service to play with Springboot and have another service
to plug in to an integration service such as Apache Camel or an ESB

