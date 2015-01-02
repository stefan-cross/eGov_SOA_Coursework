package uk.egov.health;

import java.lang.reflect.Array;

/**
* Created with IntelliJ IDEA.
* User: stefancross
* Date: 02/01/2015
* Time: 16:45
*/
public class Testing {

    public static void main(String[] args) {

        System.out.println("Running database test");

        String properties = System.getProperty("java.class.path");
        
        String[] propertyArray = properties.split(":");

        for (int i = 0; i < propertyArray.length ; i++) {
            System.out.println(propertyArray[i++]);
        }
    }

}
