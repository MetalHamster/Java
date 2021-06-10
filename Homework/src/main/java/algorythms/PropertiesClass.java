package algorythms;

import java.io.*;
import java.util.Properties;

public class PropertiesClass {
    public static void main(String[] args) throws IOException {
        InputStream readPropFile = new FileInputStream("src/main/resources/properties/p.properties");
        OutputStream writePropFile = new FileOutputStream("src/main/resources/properties/p.properties");
        OutputStream writeXMLPropFile = new FileOutputStream("src/main/resources/properties/p.xml");
        Properties properties = new Properties();

        properties.load(readPropFile);
        System.out.println(properties.isEmpty());
        System.out.println(properties.getProperty("age"));
        properties.setProperty("age","22");
        properties.store(writePropFile,"added age");
        properties.storeToXML(writeXMLPropFile,"added age");

        System.out.println(properties.getProperty("age"));

    }
}