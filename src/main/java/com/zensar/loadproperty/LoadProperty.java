package com.zensar.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {
    //pr

    //projectPath
    String projectPath = System.getProperty("user.dir");

    //creating object
    static Properties prop;
    static FileInputStream input;

    //parameter given as "String key" to assign value of key from .config file
    public String getProperty(String key) {

        //initialize the object
        prop = new Properties();

        //surround in try catch block to catch exception thrown by FileInputStream
        try {
            input = new FileInputStream(projectPath + "/src/test/java/com/zensar/resources/propretyfile/config.properties");
            prop.load(input);
            //change FileInputStream exception to IOException from java"import java.io.IOException"
            //this change is to again catch exception thrown by ".load()"
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
    //can write a main method here to check the working of the the above code written in "getProperty()"
}
