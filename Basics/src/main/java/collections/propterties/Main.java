package collections.propterties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Matthias.Flueckiger
 */
public class Main {
    public static void main(String[] args) {
        //Create new Properties class
        Properties properties = new Properties();

        try {
            //Load from existing file
            properties.load(new FileInputStream("src/main/resources/properties/p.properties"));
        } catch (IOException e) {
            System.out.println("File path not found");
        }
        //Display already define values
        System.out.println(properties);

        //Add/Overwrite values
        properties.put("user","Matthias");
        properties.put("age","10");

        //print values to console
        System.out.println(properties);

        try {
            //Store properties file to .properties and .xml
            properties.store(new FileOutputStream("src/main/resources/properties/p.properties"),"added user and age");
            properties.storeToXML(new FileOutputStream("src/main/resources/properties/p.xml"),"added user and age");

        } catch (IOException e) {
            System.out.println("File path not found");
        }

        //Get and print local systemproperties
        Properties systemProperties = System.getProperties();


        /*String systemPropertiesString = systemProperties.toString();
        String[] arrOfString = systemPropertiesString.split(",");

        for (String a: arrOfString){
            System.out.println(a);
        }*/

        System.out.println(systemProperties);
    }
}
